package com.playwright.java.pages;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.playwright.java.annotation.UIPage;
import com.playwright.java.helpers.core.WebClient;
import com.playwright.java.helpers.dto.Constants;
import com.playwright.java.helpers.dto.ElementReference;
import com.playwright.java.lib.PlaywrightLib;
import org.springframework.beans.factory.annotation.Autowired;

@UIPage
public class HotelHomePage extends WebClient {

    @Autowired
    PlaywrightLib _playwrightLib;

    public static Page popUp;

    public boolean WaitUntilUserNavigatedToHotelHome() {
        return countWebElements(ElementReference.Almatar.HOTEL_HOME_PAGE)>0;
    }

    public HotelHomePage ClickButtonHotelHome(String homeButton) {

        popUp = _driverManager.getPage().waitForPopup(() -> {
                _driverManager.getPage().click(String.format(ElementReference.Almatar.AVAILABLE_ROOMS,homeButton));
        });
        popUp.waitForLoadState();
        System.out.println(popUp.title());
        //popUp.click(String.format(ElementReference.Almatar.HOTELS_TAB,"Available Rooms"));
        _driverManager.switchToPage(popUp);
        return this;
    }

    public boolean verifyUserNavigatedHotelHome() {
        //return countWebElements(ElementReference.Almatar.HOTEL_DETAILS_TAB)>0;
        popUp.waitForSelector(ElementReference.Almatar.HOTEL_DETAILS_TAB,new Page.WaitForSelectorOptions().setTimeout(Constants.CommonConstants.TIMEOUT));
        return popUp.locator(ElementReference.Almatar.HOTEL_DETAILS_TAB).count()>0;
    }

    public HotelHomePage ClickTabHotelHome(String homeTab) {
        popUp.click(String.format(ElementReference.Almatar.HOTELS_TAB, homeTab));
        return this;
    }

    public HotelHomePage ClickButtonUnderHotelHome(String button, String option) {
        popUp.waitForSelector(String.format(ElementReference.Almatar.BOOK_NOW, option,button),new Page.WaitForSelectorOptions().setTimeout(Constants.CommonConstants.TIMEOUT));
       // popUp.check(String.format(ElementReference.Almatar.BOOK_NOW, button,option));
        popUp.click(String.format(ElementReference.Almatar.BOOK_NOW, option,button));
        return this;
    }
    public boolean ValidateChoiceUnavailable(){

        return false;
    }
}
