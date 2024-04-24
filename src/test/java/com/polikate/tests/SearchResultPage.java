package com.polikate.tests;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class SearchResultPage {

   public final String RESULT_OF_SEARCH = "Армстронг, Нил — Википедия";
   public final String NAME_OF_SITE = "ru.wikipedia.org";
   public final String LOCATOR_SITE_STRING = "//span[@class=\"d-ib p-abs t-0 l-0 fz-14 lh-20 fc-obsidian wr-bw ls-n pb-4\"]";

   public final String LOCATOR_RESULT_OF_SEARCH = "//a[@style=\"line-height:26px\"]";

   public void checkSearchResult() {
       $x(LOCATOR_SITE_STRING).shouldHave(text(NAME_OF_SITE));
       $x(LOCATOR_RESULT_OF_SEARCH).shouldHave(text(RESULT_OF_SEARCH));
   }
}
