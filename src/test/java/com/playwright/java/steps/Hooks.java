package com.playwright.java.steps;

import com.microsoft.playwright.Page;
import com.playwright.java.annotation.LazyAutowired;
import com.playwright.java.base.AppConfig;
import com.playwright.java.base.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;


public class Hooks {

  @LazyAutowired
  DriverManager _driverManager;

  @Autowired
  AppConfig _appConfig;

  @Before
  public void launchPlaywright() {
    _driverManager.launchPlaywright();
    _driverManager.launchBrowserType();
  }

  @AfterStep
  public void afterRun(Scenario scenario) throws IOException {
    if (scenario.isFailed()) {
      _driverManager.getPage()
          .screenshot(new Page.ScreenshotOptions().setPath(
              Paths.get(System.getProperty("user.dir") + "/target/images/" + scenario.getName() + ".png"))
              .setFullPage(true));
      scenario.attach(Files.readAllBytes(
          Paths.get(System.getProperty("user.dir") + "/target/images/" + scenario.getName() + ".png")), "image/png",
          scenario.getName());
    }
  }

  @After
  public void afterScenario() {
    _driverManager.close();
  }
}
