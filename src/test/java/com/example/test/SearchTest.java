package com.example.test;

import com.example.management.Base;
import com.example.page.SearchMainPage;
import com.example.service.JsonReader;
import org.junit.Test;

public class SearchTest extends Base {

    private final SearchMainPage searchMainPage = new SearchMainPage();

    @Test()
    public void searchProductInMainPage() {
        searchMainPage.enterSearchField();
        searchMainPage.searchProduct(JsonReader.getData("searching_word"));
    }

    @Test
    public void searchNotExistProduct() {
        searchMainPage.enterSearchField();
        searchMainPage.searchProduct(JsonReader.getData("noResult_word"));
        searchMainPage.verifyNoDataResult();
    }
}
