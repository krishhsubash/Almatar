package com.playwright.java.pages;

import com.playwright.java.annotation.UIPage;
import com.playwright.java.helpers.core.WebClient;
import com.playwright.java.lib.PlaywrightLib;
import org.springframework.beans.factory.annotation.Autowired;

@UIPage
public class HotelHomePage extends WebClient {

    @Autowired
    PlaywrightLib _playwrightLib;

    public boolean WaitUntilUserNavigatedToHotelHome() {

        return false;
    }

    public HotelHomePage ClickButtonHotelHome(String homeButton) {

        return this;
    }

    public boolean verifyUserNavigatedHotelHome() {

        return false;
    }

    public HotelHomePage ClickTabHotelHome(String homeTab) {

        return this;
    }

    public HotelHomePage ClickButtonUnderHotelHome(String button, String option) {
        return this;
    }
    public boolean ValidateChoiceUnavailable(){

        return false;
    }
}
