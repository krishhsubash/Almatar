package com.playwright.java.pages;

import com.microsoft.playwright.Page;
import com.playwright.java.annotation.UIPage;
import com.playwright.java.helpers.core.WebClient;
import com.playwright.java.helpers.dto.Constants;
import com.playwright.java.helpers.dto.ElementReference;
import com.playwright.java.lib.FakerLib;
import com.playwright.java.lib.PlaywrightLib;
import org.springframework.beans.factory.annotation.Autowired;

import static com.playwright.java.pages.HotelHomePage.popUp;

@UIPage
public class ReservationPage extends WebClient {

    @Autowired
    PlaywrightLib _playwrightLib;

    @Autowired
    FakerLib _fakerLib;

    public ReservationPage SelectTitle(String title) {
        popUp.waitForSelector(ElementReference.Almatar.NAME_PREFIX,new Page.WaitForSelectorOptions().setTimeout(Constants.CommonConstants.TIMEOUT));
        popUp.click(ElementReference.Almatar.NAME_PREFIX);
        popUp.click(String.format(ElementReference.Almatar.PREFIX_DROPDOWN,title));
        return this;
    }

    public ReservationPage EnterFirstName() {
        popUp.click(ElementReference.Almatar.FIRST_NAME);
        popUp.fill(ElementReference.Almatar.FIRST_NAME,_fakerLib.getFaker().lorem().sentence(1));
        return this;
    }

    public ReservationPage EnterLastName() {
        popUp.click(ElementReference.Almatar.LAST_NAME);
        popUp.fill(ElementReference.Almatar.LAST_NAME, _fakerLib.getFaker().lorem().sentence(1));
        return this;
    }

    public ReservationPage EnterEmail() {
        String email= _fakerLib.getFaker().internet().emailAddress();
        popUp.fill(ElementReference.Almatar.EMAIL_ADDRESS,email);
        return this;
    }

    public ReservationPage EnterPhoneNumber() {
        String phoneNumber = _fakerLib.getFaker().phoneNumber().subscriberNumber(9);
        popUp.fill(ElementReference.Almatar.PHONE_NUMBER,phoneNumber);
        return this;
    }

    public ReservationPage SelectDateOfBirth() {
        return this;
    }

    public ReservationPage SelectNationality(String nationality) {

        return this;
    }
}
