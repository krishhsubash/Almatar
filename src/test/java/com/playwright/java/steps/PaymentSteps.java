package com.playwright.java.steps;

import com.playwright.java.annotation.LazyAutowired;
import com.playwright.java.base.ScenarioContext;
import com.playwright.java.pages.PaymentPage;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentSteps {

    @LazyAutowired
    PaymentPage paymentPage;

    @Autowired
    ScenarioContext _scenarioContext;

    @And("I enter Credit Card Holder in Payment Page")
    public void iEnterCreditCardHolderInPaymentPage() {
        paymentPage.EnterCreditCardHolderName();
    }

    @And("I enter Credit card number in Payment Page")
    public void iEnterCreditCardNumberInPaymentPage() {
        paymentPage.EnterCreditCardNumber();
    }

    @And("I enter Expiraton Date in Payment Page")
    public void iEnterExpiratonDateInPaymentPage() {
        paymentPage.EnterExpirationDate();
    }

    @And("I enter CVV in Payment Page")
    public void iEnterCVVInPaymentPage() {
        paymentPage.EnterCvvNumber();
    }

    @And("I click on {string} button in Payment Page")
    public void iClickOnButtonInPaymentPage(String buttonName) {
        paymentPage.clickButton(buttonName);
    }
}
