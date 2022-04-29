package com.playwright.java.pages;

import com.playwright.java.annotation.UIPage;
import com.playwright.java.helpers.core.WebClient;
import com.playwright.java.lib.PlaywrightLib;
import org.springframework.beans.factory.annotation.Autowired;

@UIPage
public class PaymentPage extends WebClient {

    @Autowired
    PlaywrightLib _playwrightLib;

    public PaymentPage EnterCreditCardHolderName() {
        return this;
    }

    public PaymentPage EnterCreditCardNumber() {
        return this;
    }

    public PaymentPage EnterExpirationDate() {
        return this;
    }
    public PaymentPage EnterCvvNumber() {

        return this;
    }
}
