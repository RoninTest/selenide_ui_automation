package com.example.page;

import com.codeborne.selenide.Condition;
import com.example.helper.Method;
import com.example.service.JsonReader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {

    Method helperMethod =new Method();

    public void verifyNoDataResult() {
        $(By.className(JsonReader.getLocator("noResult_info_element"))).shouldBe(visible);
    }

    public void verifyResult() {
        String searchingData=$(By.xpath(JsonReader.getLocator("searchResult"))).getText();
        String modifiedSearchingData= helperMethod.replaceData(searchingData);
        $(By.xpath(JsonReader.getLocator("searchResult"))).shouldHave(Condition.text(modifiedSearchingData));
    }
}
