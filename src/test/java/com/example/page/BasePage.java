package com.example.page;

import com.example.service.JsonReader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public void clickBanner() {
        $(By.xpath(JsonReader.getLocator("bannerButton"))).click();
    }
    public void acceptCookie() {$(By.id(JsonReader.getLocator("acceptCookieButton"))).click();}
}
