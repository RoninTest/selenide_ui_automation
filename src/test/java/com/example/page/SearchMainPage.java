package com.example.page;

import com.codeborne.selenide.SelenideElement;
import com.example.service.JsonReader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchMainPage {

    private final SelenideElement searchField = $(By.xpath(JsonReader.getLocator("searchField")));
    public void clickBanner() {
        $(By.xpath(JsonReader.getLocator("bannerButton"))).click();
    }
    public void acceptCookie() {$(By.id(JsonReader.getLocator("acceptCookieButton"))).click();}
    public void enterSearchField() {$(By.id(JsonReader.getLocator("searchButton"))).click();}
    public void searchProduct(String text) {searchField.val(text).pressEnter();}
}
