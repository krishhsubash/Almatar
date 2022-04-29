package com.playwright.java.base;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.playwright.java.annotation.ThreadScopeBean;
import com.playwright.java.config.ConfigReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

  private final ObjectMapper objectMapper;

  private static final Logger logger = Logger.getLogger(String.valueOf(AppConfig.class));

  @Autowired
  AppConfig(ObjectMapper objectMapper){
    this.objectMapper = objectMapper;
  }

  @ThreadScopeBean
  public ConfigReader getReader() {
    TypeReference<ConfigReader> typeReference = new TypeReference<>() {};
    InputStream inputStream = TypeReference.class.getResourceAsStream("/appConfig.json");
    ConfigReader configReader = null;
    try {
      configReader = objectMapper.readValue(inputStream, typeReference);
      logger.info("Launching " + configReader.getBrowser()+ " Browser Instance");
    } catch (IOException e) {
      logger.info("Unable to Load Users Data: " + e.getMessage());
    }
    return configReader;
  }
}
