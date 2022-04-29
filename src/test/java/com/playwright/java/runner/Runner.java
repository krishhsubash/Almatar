package com.playwright.java.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = {"src/test/java/com/playwright/java/features"},
    glue = "com.playwright.java.steps",
    plugin = { "pretty",
               "json:target/cucumber-reports/Cucumber.json",
               "html:target/cucumber-reports/Index.html"},
    monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {

  @Override
  @DataProvider(parallel = true)
  public Object[][] scenarios() {
    return super.scenarios();
  }
}
