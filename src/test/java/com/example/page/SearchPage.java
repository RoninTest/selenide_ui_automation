package com.example.page;

import com.codeborne.selenide.SelenideElement;
import com.example.service.JsonReader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchPage {

    private final SelenideElement searchField = $(By.xpath(JsonReader.getLocator("searchField")));

    public SearchResultPage searchProduct(String text) {
        searchField.val(text).pressEnter();
        return page(SearchResultPage.class);
    }
}




