package com.playwright.java.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BrowserScopeConfig {

  BrowserScopeConfig() {}

  @Bean
  public static BrowserScopePostProcessor beanFactoryPostProcessor() {
    return new BrowserScopePostProcessor();
  }
}
