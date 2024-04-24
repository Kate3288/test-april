package com.polikate.tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;


public class FirstTest {

    final String RESULT_OF_SEARCH = "Армстронг, Нил — Википедия";
    final String NAME_OF_SITE = "ru.wikipedia.org";

    @Test
    public void enterYourSearch() {
        open("https://search.yahoo.com/");
        $x("//input[@id='yschsp']").shouldBe(visible);
        $x("//input[@id='yschsp']").setValue("Первый человек на Луне").pressEnter();
        $x("//span[@class=\"d-ib p-abs t-0 l-0 fz-14 lh-20 fc-obsidian wr-bw ls-n pb-4\"]").shouldHave(text(NAME_OF_SITE));
        $x("//a[@style=\"line-height:26px\"]").shouldHave(text(RESULT_OF_SEARCH));
    }
}
