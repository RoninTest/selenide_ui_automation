package com.example.management;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.example.service.JsonReader;
import org.junit.After;
import org.junit.Before;


import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Base {
    BannerManagement banner = new BannerManagement();
    CookieManagement cookie = new CookieManagement();

    @Before
    public void setUp() {
        Configuration.browser = Browsers.CHROME;
        open(JsonReader.getUrl("base_url"));
        WebDriverRunner.getWebDriver().manage().window().maximize();
        banner.clickBanner();
        cookie.acceptCookie();
    }

    @After
    public void closeDriver() {
        closeWebDriver();
    }
}
