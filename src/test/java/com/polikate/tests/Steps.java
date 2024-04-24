package com.polikate.tests;

public class Steps {

    public void startSearch() {
        StartBrowserPage startBrowserPage = new StartBrowserPage();
        startBrowserPage.startSearch();
    }

    public void checkResult() {
        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.checkSearchResult();
    }
}
