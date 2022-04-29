package com.playwright.java.pages;

import com.playwright.java.annotation.UIPage;
import com.playwright.java.helpers.core.WebClient;
import com.playwright.java.lib.PlaywrightLib;
import org.springframework.beans.factory.annotation.Autowired;

@UIPage
public class ReservationPage extends WebClient {

    @Autowired
    PlaywrightLib _playwrightLib;

    public ReservationPage SelectTitle(String title) {
        return this;
    }

    public ReservationPage EnterFirstName() {
        return this;
    }

    public ReservationPage EnterLastName() {
        return this;
    }

    public ReservationPage EnterEmail() {
        return this;
    }

    public ReservationPage EnterPhoneNumber() {
        return this;
    }

    public ReservationPage SelectDateOfBirth() {
        return this;
    }

    public ReservationPage SelectNationality(String nationality) {

        return this;
    }
}
