package com.playwright.java.pages;

import com.microsoft.playwright.Frame;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitUntilState;
import com.playwright.java.annotation.UIPage;
import com.playwright.java.helpers.core.WebClient;
import com.playwright.java.helpers.dto.Constants;
import com.playwright.java.helpers.dto.ElementReference;
import com.playwright.java.lib.PlaywrightLib;
import java.util.concurrent.locks.ReentrantLock;
import org.springframework.beans.factory.annotation.Autowired;


@UIPage
public class HomePage extends WebClient {

  @Autowired
  PlaywrightLib _playwrightLib;

  private static final ReentrantLock LOCK = new ReentrantLock();

  public HomePage loginToCrm(String userRole) {
    _driverManager.getPage().click(ElementReference.Home.USER_NAME);
    if (userRole.equals("SalesRep")) {
      _driverManager.getPage()
          .fill(ElementReference.Home.USER_NAME, _appConfig.getReader().getMscrm().getSalesRepUsername());
      _driverManager.getPage().waitForNavigation(() -> {
        _driverManager.getPage().click(ElementReference.Home.LOGIN_NEXT);
      });
      _driverManager.getPage().click(ElementReference.Home.PASSWORD);
      _driverManager.getPage()
          .fill(ElementReference.Home.PASSWORD, _appConfig.getReader().getMscrm().getSalesRepPassword());
    }
    _driverManager.getPage().waitForNavigation(() -> {
      _driverManager.getPage().click(ElementReference.Home.LOGIN_NEXT);
    });
    _driverManager.getPage().waitForNavigation(() -> {
      new Page.WaitForNavigationOptions().setWaitUntil(WaitUntilState.DOMCONTENTLOADED);
      _driverManager.getPage().click(ElementReference.Home.LOGIN_NEXT);
    });
    return this;
  }

  public HomePage loginToSfdcCrm() {

    _driverManager.getPage().click(ElementReference.SFDC.USERNAME);
    _driverManager.getPage().fill(ElementReference.SFDC.USERNAME, _appConfig.getReader().getSfdc().getUsername());

    _driverManager.getPage().click(ElementReference.SFDC.PASSWORD);
    _driverManager.getPage().fill(ElementReference.SFDC.PASSWORD, _appConfig.getReader().getSfdc().getPassword());
    _driverManager.getPage()
        .waitForNavigation(new Page.WaitForNavigationOptions().setWaitUntil(WaitUntilState.DOMCONTENTLOADED), () -> {
          _driverManager.getPage().click(ElementReference.SFDC.LOGIN_BUTTON);
        });
    return this;
  }

  public HomePage loginToSfdcCrm(String userRole) {
    loginToSfdcCrm();
    return this;
  }

  public HomePage navigateToUciApp(String appName) {
    _driverManager.getPage()
        .waitForNavigation(new Page.WaitForNavigationOptions().setWaitUntil(WaitUntilState.DOMCONTENTLOADED), () -> {
          _driverManager.getPage().waitForSelector(ElementReference.Home.APP_LANDING_PAGE).focus();
          Frame frame = _driverManager.getPage().waitForSelector(ElementReference.Home.APP_LANDING_PAGE).contentFrame();
          frame.waitForSelector(String.format(ElementReference.Home.UCI_APP, appName)).click();
        });
    return this;
  }

  public HomePage selectSubArea(String subArea) {
    _driverManager.getPage().waitForNavigation(() -> {
      _driverManager.getPage().click(String.format(ElementReference.Home.SUB_AREA, subArea));
    });
    return this;
  }

  public HomePage clickMenuItem(String menuItem) {
    _driverManager.getPage().click(String.format(ElementReference.Case.MENU_ITEM, menuItem));
    return this;
  }

  public HomePage navigateToTab(String homeTab) {
    if (homeTab.equals("Opportunities")) {
      _driverManager.getPage().waitForNavigation(() -> {
        _driverManager.getPage().click(ElementReference.SFDC.OPPORTUNITY_TAB);
      });
    }
    return this;
  }

  public HomePage selectView(String selectView) {
    return this;
  }

  public HomePage clickSfdcHomeButton(String homeButton) {
    _driverManager.getPage().waitForNavigation(() -> {
      _driverManager.getPage().click(String.format(ElementReference.SFDC.SFDC_HOME_BUTTON, homeButton));
    });
    return this;
  }

  public HomePage selectOpportunityRecordType(String recordType) {
    _driverManager.getPage().selectOption("select[name=\"p3\"]", "012300000000alM");
    return this;
  }

  public HomePage clickButtonHomePage(String homeButton) {
    _driverManager.getPage().waitForNavigation(() -> {
      _driverManager.getPage().click("text=" + homeButton);
    });
    return this;
  }

  public HomePage launchHomePage(String url) {
    _driverManager.getPage().navigate(url);
    return this;
  }

  public HomePage launchBulletPage(String url) {
    _driverManager.getPage().navigate(url);
    if (_playwrightLib.isVisible(_driverManager.getPage(), ElementReference.Bullet.LOGIN_BUTTON)) {
      _driverManager.getPage().click(ElementReference.Bullet.LOGIN_BUTTON);
      _driverManager.getPage().click(ElementReference.Home.USER_NAME);
      _driverManager.getPage().fill(ElementReference.Home.USER_NAME, _appConfig.getReader().getBullet().getUsername());
      _driverManager.getPage().click(String.format(ElementReference.Bullet.NEXT_BUTTON, "Next"));

      if (_playwrightLib.isVisible(_driverManager.getPage(), ElementReference.Bullet.USE_PASSWORD_LINK)) {
        _driverManager.getPage().click(ElementReference.Bullet.USE_PASSWORD_LINK);
      }

      if (_playwrightLib.isVisible(_driverManager.getPage(), ElementReference.Home.PASSWORD_LINK)) {
        _driverManager.getPage().click(ElementReference.Home.PASSWORD_LINK);
      }
      _driverManager.getPage().click(ElementReference.Home.PASSWORD_INPUT);
      _driverManager.getPage()
          .fill(ElementReference.Home.PASSWORD_INPUT, _appConfig.getReader().getBullet().getPassword());
      _driverManager.getPage().click(ElementReference.Bullet.SIGN_IN);

      // Lock this session for the current thread.
      LOCK.lock();
      try {
        _driverManager.getPage().click(ElementReference.Bullet.SIGN_IN_PHONE_TOKEN);
        if (_playwrightLib.isVisible(_driverManager.getPage(), ElementReference.Bullet.ALTERNATE_OPTION, 60)) {
          _driverManager.getPage().waitForNavigation(() ->
            _driverManager.getPage().click(ElementReference.Bullet.ALTERNATE_OPTION));
          _driverManager.getPage().click(ElementReference.Bullet.VERIFICATION_OPTION1);
        }
        _playwrightLib.isVisible(_driverManager.getPage(), ElementReference.Bullet.BULLET_HOME, 60);
      } catch (Exception e) {
        e.printStackTrace();
      } finally {
        // Release the lock
        LOCK.unlock();
      }
    }
    return this;
  }

  public HomePage enterUserName(String userName) {
    _driverManager.getPage().fill(ElementReference.Home.USER_NAME, userName);
    return this;
  }

  public HomePage selectSignInOption(String signInOption) {
    _driverManager.getPage().click(String.format(ElementReference.Home.SIGN_IN_OPTION, signInOption));
    return this;
  }

  public HomePage enterPasswordHomePage() {
    _driverManager.getPage().click(ElementReference.Home.PASSWORD_INPUT);
    _driverManager.getPage().fill(ElementReference.Home.PASSWORD_INPUT, "");
    return this;
  }

  public HomePage clickDifferentVerificationOption(String verificationOption) {
    _driverManager.getPage()
        .waitForSelector(String.format(ElementReference.Home.SIGN_IN_OPTION, verificationOption),
            new Page.WaitForSelectorOptions().setTimeout(Constants.CommonConstants.TIMEOUT));
    _driverManager.getPage().pause();
    _driverManager.getPage().click(String.format(ElementReference.Home.SIGN_IN_OPTION, verificationOption));
    return this;
  }

  public HomePage clickLinkBulletHome(String bulletHome) {
    _driverManager.getPage().click(ElementReference.Home.SUBMIT_BUTTON);
    return this;
  }

  public HomePage clickOption(String option) {

    return this;
  }

  public HomePage EnterGoingTo(String goingTo) {

    return this;
  }

  public HomePage SelectPredictiveResult() {

    return this;
  }

  public HomePage SelectCheckInDate() {

    return this;
  }

  public HomePage SelectCheckoutDate() {

    return this;
  }

  public HomePage SelectTravellers() {

    return  this;
  }

  public HomePage ClickOnSearchOption() {

    return this;
  }
}
