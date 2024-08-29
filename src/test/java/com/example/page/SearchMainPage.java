package com.example.page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import com.example.service.JsonReader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchMainPage {

    private final SelenideElement searchField = $(By.xpath(JsonReader.getLocator("searchField")));
    public void enterSearchField() {$(By.id(JsonReader.getLocator("searchButton"))).click();}
    public void searchProduct(String text) {searchField.val(text).pressEnter();}
    public void verifyNoDataResult() {$(By.className(JsonReader.getData("noResult_info_element"))).shouldBe(visible);}}
