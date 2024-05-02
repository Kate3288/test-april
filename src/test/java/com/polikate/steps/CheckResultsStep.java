package com.polikate.steps;

import com.polikate.pages.SearchResultPage;
import org.testng.asserts.Assertion;

public class CheckResultsStep {

    private static CheckResultsStep checkResultsStep;
    private final Assertion assertion = new Assertion();

    private CheckResultsStep() {
    }

    public static CheckResultsStep getInstance() {
        if (checkResultsStep == null) {
            checkResultsStep = new CheckResultsStep();
        }
        return checkResultsStep;
    }

    //Проверяем, что результаты те, что мы и ожидаем
    public void assertThatFirstLinkUrlEqualsExpected(String expectedUrl) {
        assertion.assertEquals(SearchResultPage.getInstance().getFirstLinkUrl(), expectedUrl,
                String.format("Actual URL is not equals expected: %s", expectedUrl));
    }
}
