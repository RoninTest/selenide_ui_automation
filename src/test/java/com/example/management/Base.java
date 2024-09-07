package com.example.management;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.service.JsonReader;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Base {
    BannerManagement banner = new BannerManagement();
    CookieManagement cookie = new CookieManagement();

    @BeforeAll
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        Configuration.browser = Browsers.CHROME;
        open(JsonReader.getUrl("base_url"));
        WebDriverRunner.getWebDriver().manage().window().maximize();
        banner.clickBanner();
        cookie.acceptCookie();
    }

    @AfterEach
    public void closeDriver() {
        closeWebDriver();
    }
}
