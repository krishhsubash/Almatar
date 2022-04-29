package com.playwright.java.helpers.core;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Frame;
import com.playwright.java.annotation.UIPage;
import com.playwright.java.pages.AbstractBasePage;


@UIPage
public class WebClient extends AbstractBasePage {

  public Frame navigateToFrame(String frameId) {
    ElementHandle iframeElement = _driverManager.getPage().querySelector(frameId);
    return iframeElement.contentFrame();
  }

  public void clickElement(String locator, String element) {
    _driverManager.getPage().click(locator);
  }
}
