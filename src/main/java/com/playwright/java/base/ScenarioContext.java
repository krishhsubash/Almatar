package com.playwright.java.base;

import io.cucumber.spring.ScenarioScope;
import java.util.HashMap;
import org.springframework.context.annotation.Configuration;


@ScenarioScope
@Configuration
public class ScenarioContext {
  private HashMap<String, Object> map = new HashMap<>();

  public void add(String key, Object value) {
    map.put(key, value);
  }

  public Object get(String key) {
    return map.get(key);
  }
}
