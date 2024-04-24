package com.polikate.tests;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class StartBrowserPage
{
    public final String URl_YAHOO = "https://search.yahoo.com/";
    public final String SEARCH_STRING_LOCATOR = "//input[@id='yschsp']";

    public void startSearch() {
        open(URl_YAHOO);
        $x(SEARCH_STRING_LOCATOR).setValue("Первый человек на Луне").pressEnter();
    }
}
