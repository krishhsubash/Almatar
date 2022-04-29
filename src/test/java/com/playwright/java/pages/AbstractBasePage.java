package com.playwright.java.pages;

import com.playwright.java.annotation.LazyAutowired;
import com.playwright.java.base.AppConfig;
import com.playwright.java.base.DriverManager;


public abstract class AbstractBasePage {
  @LazyAutowired
  protected DriverManager _driverManager;

  @LazyAutowired
  protected AppConfig _appConfig;
}
