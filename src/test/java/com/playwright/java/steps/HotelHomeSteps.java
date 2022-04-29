package com.playwright.java.steps;

import com.playwright.java.annotation.LazyAutowired;
import com.playwright.java.base.ScenarioContext;
import com.playwright.java.pages.HotelHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class HotelHomeSteps {

    @LazyAutowired
    HotelHomePage hotelHomePage;

    @Autowired
    ScenarioContext _scenarioContext;
    @Then("I wait until the user is navigated to Hotel Home Page")
    public void iWaitUntilTheUserIsNavigatedToHotelHomePage() {
        Assert.isTrue(hotelHomePage.WaitUntilUserNavigatedToHotelHome(),"User is not navigated to hotel home Page");
    }

    @When("I click on {string} button in Hotel Home Page")
    public void iClickOnButtonInHotelHomePage(String homeButton) {
        hotelHomePage.ClickButtonHotelHome(homeButton);
    }

    @Then("I verify user is navigated to Hotel Home Page")
    public void iVerifyUserIsNavigatedToHotelHomePage() {
        Assert.isTrue(hotelHomePage.verifyUserNavigatedHotelHome(),"User is not navigated to hotel home Page");

    }

    @When("I click on {string} tab in Hotel Home Page")
    public void iClickOnTabInHotelHomePage(String homeTab) {
        hotelHomePage.ClickTabHotelHome(homeTab);
    }

    @And("I click on {string} button under {string} option in Hotel Home Page")
    public void iClickOnButtonUnderOptionInHotelHomePage(String button, String option) {
        hotelHomePage.ClickButtonUnderHotelHome(button,option);
    }

    @Then("I validate if Choice UnAvailable option is displayed in Hotel Home Page")
    public void iValidateIfChoiceUnAvailableOptionIsDisplayedInHotelHomePage() {
        Assert.isTrue(hotelHomePage.ValidateChoiceUnavailable(), "");
    }
}
