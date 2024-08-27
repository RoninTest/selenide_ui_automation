package com.example.test;

import com.codeborne.selenide.*;
import com.example.page.SearchMainPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchTest extends SearchMainPage {

    @Before
    public void setUp() {
        Configuration.browser = Browsers.CHROME;
        open("https://www.trendyol.com");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        clickBanner();
        acceptCookie();
    }

    @Test
    public void searchProductInMainPage() {
        enterSearchField();
        searchProduct("iphone");
    }
}
