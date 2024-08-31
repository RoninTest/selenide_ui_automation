package com.example.page;

import com.codeborne.selenide.WebElementCondition;
import com.example.service.JsonReader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {

    public void verifyNoDataResult() {
        $(By.className(JsonReader.getData("noResult_info_element"))).shouldBe(visible);
    }

    public void verifyResult() {
        $(By.xpath(JsonReader.getLocator("searchResult"))).shouldHave(text(JsonReader.getData("searching_word")));
    }
}
