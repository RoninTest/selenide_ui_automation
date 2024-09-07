package com.example.test;

import com.example.management.Base;
import com.example.page.SearchPage;
import com.example.page.SearchResultPage;
import com.example.service.JsonReader;
import org.junit.jupiter.api.Test;


public class SearchTest extends Base {

    SearchResultPage searchResultPage;
    private final SearchPage searchPage = new SearchPage();

    @Test
    public void searchProductInMainPage() {
        searchResultPage = searchPage.searchProduct(JsonReader.getData("searching_word"));
        searchResultPage.verifyResult();
    }

    @Test
    public void searchNotExistProduct() {
        searchResultPage = searchPage.searchProduct(JsonReader.getData("noResult_word"));
        searchResultPage.verifyNoDataResult();
    }
}




