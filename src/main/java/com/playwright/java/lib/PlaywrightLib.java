package com.playwright.java.lib;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.TimeoutError;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PlaywrightLib {

  @Bean
  Browser.NewContextOptions getNewContextOptionos() {
    return new Browser.NewContextOptions();
  }

  @Bean
  BrowserType.LaunchOptions getNewLaunchOptions() {
    return new BrowserType.LaunchOptions();
  }

  @Bean
  BrowserType.LaunchPersistentContextOptions getNewPersistentContext() {
    return new BrowserType.LaunchPersistentContextOptions();
  }

  @Bean
  public ObjectMapper getObjectMapper(){
    return new ObjectMapper();
  }

  public boolean isVisible(Page page, String selector) {
    try {
      page.waitForSelector(selector);
      return true;
    } catch (TimeoutError error) {
      return false;
    }
  }

  public boolean isVisible(Page page, String selector, double timeout) {
    try {
      page.waitForSelector(selector,new Page.WaitForSelectorOptions().setTimeout(timeout * 1000L));
      return true;
    } catch (TimeoutError error) {
      return false;
    }
  }
}
