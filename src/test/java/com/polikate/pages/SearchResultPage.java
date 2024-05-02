package com.polikate.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class SearchResultPage {

   public final String RESULT_OF_SEARCH = "Армстронг, Нил — Википедия";
   public final String LOCATOR_SITE_STRING = "//span[contains(@class, 'fc-obsidian')]";
   public final String LOCATOR_RESULT_OF_SEARCH = "//a[@style='line-height:26px']";
   private static final SearchResultPage searchResultPage = new SearchResultPage();

    public String getFirstLinkUrl() {
            return $x(LOCATOR_SITE_STRING).getText();
//            $x(LOCATOR_RESULT_OF_SEARCH).shouldHave(text(RESULT_OF_SEARCH));
   }

    //сделаем приватный констуктор для синглтона
    private SearchResultPage() {
    }

    //Объявите статический создающий метод, который будет использоваться для получения одиночки.
    public static SearchResultPage getInstance() {
        return searchResultPage;
    }
}
