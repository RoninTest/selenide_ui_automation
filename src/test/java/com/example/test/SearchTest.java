package com.example.test;

import com.example.management.Base;
import com.example.page.SearchMainPage;
import com.example.page.SearchResultPage;
import com.example.service.JsonReader;
import org.junit.jupiter.api.Test;


public class SearchTest extends Base {

    SearchResultPage searchResultPage;
    private final SearchMainPage searchMainPage = new SearchMainPage();

    @Test
    public void searchProductInMainPage() {
        searchResultPage = searchMainPage.searchProduct(JsonReader.getData("searching_word"));
        searchResultPage.verifyResult();
    }

    @Test
    public void searchNotExistProduct() {
        searchResultPage = searchMainPage.searchProduct(JsonReader.getData("noResult_word"));
        searchResultPage.verifyNoDataResult();
    }
}




