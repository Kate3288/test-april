package com.polikate.tests;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
public class StartBrowserPage
{
    private final String URl_YAHOO = "https://search.yahoo.com/";
    private final String SEARCH_STRING_LOCATOR = "//input[@id='yschsp']";
    private final String SEARCH_TEXT = "Первый человек на Луне";


    public void startSearch() {
        open(URl_YAHOO);
        $x(SEARCH_STRING_LOCATOR).setValue(SEARCH_TEXT).pressEnter();
    }
}
