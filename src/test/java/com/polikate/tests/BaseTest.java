package com.polikate.tests;

import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public static final String URL_YAHOO = "https://search.yahoo.com/";

    @BeforeTest
    public void openBrowser() {
        open(URL_YAHOO);
    }
}
