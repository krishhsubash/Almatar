package com.playwright.java.steps;

import com.playwright.java.annotation.LazyAutowired;
import com.playwright.java.base.ScenarioContext;
import com.playwright.java.pages.ReservationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class ReservationSteps {

    @LazyAutowired
    ReservationPage reservationPage;
    @Autowired
    ScenarioContext _scenarioContext;
    @When("I select the title as {string} in Reservation Page")
    public void iSelectTheTitleAsInReservationPage(String title) {
        reservationPage.SelectTitle(title);
    }

    @And("I enter First Name in Reservation Page")
    public void iEnterFirstNameInReservationPage() {
        reservationPage.EnterFirstName();
    }

    @And("I enter Last name in Reservation Page")
    public void iEnterLastNameInReservationPage() {
        reservationPage.EnterLastName();
    }

    @And("I enter Email in the Reservation Page")
    public void iEnterEmailInTheReservationPage() {
        reservationPage.EnterEmail();
    }

    @And("I enter Phone Number in Reservation Page")
    public void iEnterPhoneNumberInReservationPage() {
        reservationPage.EnterPhoneNumber();
    }

    @And("I select Date of Birth in Reservation Page")
    public void iSelectDateOfBirthInReservationPage() {
        reservationPage.SelectDateOfBirth();
    }

    @And("I select Nationality as {string} in Reservation Page")
    public void iSelectNationalityAsInReservationPage(String nationality) {
        reservationPage.SelectNationality(nationality);
    }
}
