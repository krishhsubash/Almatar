package com.playwright.java.steps;

import com.playwright.java.annotation.LazyAutowired;
import com.playwright.java.base.AppConfig;
import com.playwright.java.base.DriverManager;
import com.playwright.java.base.ScenarioContext;
import com.playwright.java.helpers.dto.Constants;
import com.playwright.java.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;


public class HomeSteps {

  @LazyAutowired
  HomePage _homePage;

  @LazyAutowired
  DriverManager _driverManager;

  @Autowired
  AppConfig _appConfig;

  @Autowired
  private ScenarioContext _scenarioContext;

  @Given("I Login in to CRM as {string}")
  public void iLoginInToCRMAs(String userRole) {
    _homePage.loginToCrm(userRole);
  }

  @Given("I navigate to {string} UCI App")
  public void iNavigateToUCIApp(String appName) {
    _homePage.navigateToUciApp(appName);
  }

  @Given("I select {string} subArea")
  public void iSelectSubArea(String subArea) {
    _homePage.selectSubArea(subArea);
  }

  @When("I click on the {string} button in the home page")
  public void iClickOnTheButtonInTheHomePage(String menuItem) {
    _homePage.clickMenuItem(menuItem);
  }

  @Given("I login in to sfdc as admin user")
  public void iLoginInToSfdc() {
    _homePage.loginToSfdcCrm();
  }

  @Given("I login in to sfdc as {string} user")
  public void iLoginInToSfdcAs(String userRole) {
    _homePage.loginToSfdcCrm(userRole);
  }

  @When("I navigate to {string} tab in Sfdc HomePage")
  public void iNavigateToTabInSfdcHomePage(String homeTab) {
    _homePage.navigateToTab(homeTab);
  }

  @And("I select view as {string} in Sfdc HomePage")
  public void iSelectViewAsInSfdcHomePage(String selectView) {
    _homePage.selectView(selectView);
  }

  @And("I click on {string} Button in Sfdc HomePage")
  public void iClickOnButtonInSfdcHomePage(String homeButton) {
    _homePage.clickSfdcHomeButton(homeButton);
  }

  @And("I select Opportunity Record Type as {string} in Home Page")
  public void iSelectOpportunityRecordTypeAsInHomePage(String recordType) {
    _homePage.selectOpportunityRecordType(recordType);
  }

  @And("I click on {string} button in Home Page")
  public void iClickOnButtonInHomePage(String homeButton) {
    _homePage.clickButtonHomePage(homeButton);
  }

  @Given("I launch {string} page")
  public void iLaunchPage(String pageName) {
    if (pageName.equalsIgnoreCase(Constants.Application.BULLET.toString())) {
      _driverManager.createNewPage(Constants.Application.BULLET.toString());
      _homePage.launchBulletPage(_appConfig.getReader().getBullet().getBulletUrl());
    } else if (pageName.equalsIgnoreCase(Constants.Application.SALESLOFT.toString())) {
      _driverManager.createNewPage(Constants.Application.SALESLOFT.toString());
      _homePage.launchHomePage(_appConfig.getReader().getSalesloft().getSaleslofturl());
    } else if (pageName.equalsIgnoreCase(Constants.Application.SFDC.toString())) {
      _driverManager.createNewPage(Constants.Application.SFDC.toString());
      _homePage.launchHomePage(_appConfig.getReader().getSfdc().getSfdcUrl());
    } else if (pageName.equalsIgnoreCase(Constants.Application.MSCRM.toString())) {
      _driverManager.createNewPage(Constants.Application.MSCRM.toString());
      _homePage.launchHomePage(_appConfig.getReader().getMscrm().getOnlineCrmUrl());
    } else if (pageName.equalsIgnoreCase(Constants.Application.ROSTER.toString())) {
      _driverManager.createNewPage(Constants.Application.ROSTER.toString());
      _homePage.launchHomePage(_appConfig.getReader().getRoster().getRosterUrl());
    }
    else if (pageName.equalsIgnoreCase(Constants.Application.ALMATAR.toString())) {
      _driverManager.createNewPage(Constants.Application.ALMATAR.toString());
      _homePage.launchHomePage(_appConfig.getReader().getAlmatar().getAlmatarUrl());
    }
  }

  @And("I enter username as {string} in Home Page")
  public void iEnterUsernameAsInHomePage(String userName) {
    _homePage.enterUserName(userName);
  }

  @And("I select Sign In option as {string} in Home Page")
  public void iSelectSignInOptionAsInHomePage(String signInOption) {
    _homePage.selectSignInOption(signInOption);
  }

  @And("I enter password credentials in Home Page")
  public void iEnterPasswordCredentialsInHomePage() {
    _homePage.enterPasswordHomePage();
  }

  @And("I select Sign Option as {string} in Home Page")
  public void iSelectSignOptionAsInHomePage(String signInOption) {
    _homePage.selectSignInOption(signInOption);
  }

  @And("I click on {string} link in Home Page")
  public void iClickOnLinkInHomePage(String verificationOption) {
    _homePage.clickDifferentVerificationOption(verificationOption);
  }

  @And("I click on {string} link in Bullet Home Page")
  public void iClickOnLinkInBulletHomePage(String buttonHome) {
    _homePage.clickLinkBulletHome(buttonHome);
  }

  @When("I switch to {string} page")
  public void iSwitchToPage(String application) {
    _driverManager.switchToPage(application);
  }

  @When("I click on {string} option in Home Page")
  public void clickOption(String option) {
    _homePage.clickOption(option);
  }

  @When("I enter Going To as {string} in Home Page")
  public void iEnterGoingToAsInHomePage(String goingTo) {
    _homePage.EnterGoingTo(goingTo);
  }

  @When("I select the predictive result in the dropdown in Home Page")
  public void iSelectThePredictiveResultInTheDropDownInHomePage() {
    _homePage.SelectPredictiveResult();
  }

  @When("I select the check in date in Home Page")
  public void iSelectTheCheckInDateInHomePage() {
    _homePage.SelectCheckInDate();
  }

  @When("I select the check out date in Home Page")
  public void iSelectTheCheckOutDateInHomePage() {
    _homePage.SelectCheckoutDate();
  }

  @When("I select the travellers as 3 in Home Page")
  public void iSelectTheTravellersAs3InHomePage() {
    _homePage.SelectTravellers();
  }
  @When("I click on the search option in Home Page")
  public void iClickOnTheSearchOptionInHomePage() {
    _homePage.ClickOnSearchOption();
  }

  @When("I select {string} language option in Home Page")
  public void iSelectLanguageOptionInHomePage(String language) {
    _homePage.SelectLanguage(language);
  }
}
