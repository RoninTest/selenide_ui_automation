package com.example.base;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.example.page.BasePage;
import com.example.service.JsonReader;
import org.junit.After;
import org.junit.Before;


import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Base extends BasePage {
    @Before
    public void setUp() {
        Configuration.browser = Browsers.CHROME;
        open(JsonReader.getUrl("base_url"));
        WebDriverRunner.getWebDriver().manage().window().maximize();
        clickBanner();
        acceptCookie();
    }

    @After
    public void closeDriver(){
        closeWebDriver();
    }
}
