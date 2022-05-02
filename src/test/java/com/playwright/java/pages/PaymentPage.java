package com.playwright.java.pages;

import com.playwright.java.annotation.UIPage;
import com.playwright.java.helpers.core.WebClient;
import com.playwright.java.helpers.dto.ElementReference;
import com.playwright.java.lib.FakerLib;
import com.playwright.java.lib.PlaywrightLib;
import org.springframework.beans.factory.annotation.Autowired;

import static com.playwright.java.pages.HotelHomePage.popUp;

@UIPage
public class PaymentPage extends WebClient {

    @Autowired
    PlaywrightLib _playwrightLib;

    @Autowired
    FakerLib _fakerLib;

    public PaymentPage EnterCreditCardHolderName() {
        popUp.click(ElementReference.Almatar.FIRST_NAME);
        popUp.fill(ElementReference.Almatar.FIRST_NAME,_fakerLib.getFaker().lorem().sentence(1));
        return this;
    }

    public PaymentPage EnterCreditCardNumber() {
        String creditCard = _fakerLib.getFaker().number().digits(16);
        popUp.fill(ElementReference.Almatar.PHONE_NUMBER,creditCard);
        return this;
    }

    public PaymentPage EnterExpirationDate() {
        return this;
    }
    public PaymentPage EnterCvvNumber() {
        String cvv = _fakerLib.getFaker().number().digits(3);
        popUp.fill(ElementReference.Almatar.PHONE_NUMBER,cvv);
        return this;
    }

    public PaymentPage clickButton(String buttonName) {
        popUp.click(ElementReference.Almatar.CONTINUE);
        return this;
    }
}
