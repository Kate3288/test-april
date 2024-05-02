package com.polikate.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class BeginSearchPage
{
    private final String LOGO_OF_THE_SITE = "//a[@id='logo']";

    private final String NAME_OF_THE_SITE = "Yahoo";
    private final String SEARCH_BOX = "//input[@id='yschsp']";
    private final String SEARCH_TEXT = "Первый человек на Луне";
    private static final BeginSearchPage BEGIN_SEARCH_PAGE = new BeginSearchPage();

    private BeginSearchPage() {
    }

    //Объявите статический создающий метод, который будет использоваться для получения одиночки.
    public static BeginSearchPage getInstance() {
        return BEGIN_SEARCH_PAGE;
    }

    public void enterSearchTextAndClickEnter() {
        $x(SEARCH_BOX).setValue(SEARCH_TEXT).pressEnter();
    }

    //сделаем приватный констуктор для синглтона
    public void checkLogoOnThePage() {
        $x(LOGO_OF_THE_SITE).shouldHave(text(NAME_OF_THE_SITE));
    }
}

