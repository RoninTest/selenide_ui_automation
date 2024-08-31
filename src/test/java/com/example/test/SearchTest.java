package com.example.test;

import com.example.management.Base;
import com.example.page.SearchMainPage;
import com.example.page.SearchResultPage;
import com.example.service.JsonReader;
import org.junit.Test;

public class SearchTest extends Base {

    private final SearchMainPage searchMainPage = new SearchMainPage();

    @Test()
    public void searchProductInMainPage() {
        SearchResultPage resultsPage = searchMainPage.searchProduct(JsonReader.getData("searching_word"));
        resultsPage.verifyResult();
    }

    @Test
    public void searchNotExistProduct() {
        SearchResultPage resultsPage = searchMainPage.searchProduct(JsonReader.getData("noResult_word"));
        resultsPage.verifyNoDataResult();
    }
}




