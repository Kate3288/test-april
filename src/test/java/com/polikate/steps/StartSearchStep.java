package com.polikate.steps;
import com.codeborne.selenide.WebDriverRunner;
import com.polikate.pages.BeginSearchPage;
import com.polikate.tests.BaseTest;
import static org.testng.Assert.assertEquals;


public class StartSearchStep {

    private final static StartSearchStep startSearchPage = new StartSearchStep();

    private StartSearchStep(){
    }

    public static StartSearchStep getInstance() {
        return startSearchPage;
    }
    //Ввод поискового запроса
    public void startSearch() {
        assertEquals(BaseTest.URL_YAHOO, WebDriverRunner.url());
        BeginSearchPage.getInstance().enterSearchTextAndClickEnter();
    }

}
