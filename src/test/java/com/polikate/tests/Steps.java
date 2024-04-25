package com.polikate.tests;

public class Steps {

    private final StartBrowserPage startBrowserPage = new StartBrowserPage();
    private final SearchResultPage searchResultPage = new SearchResultPage();


    public void startSearch() {
        startBrowserPage.startSearch();
    }

    public void checkResult() {
        searchResultPage.checkSearchResult();
    }
}
