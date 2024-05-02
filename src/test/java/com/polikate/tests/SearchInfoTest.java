package com.polikate.tests;

import com.polikate.constants.Url;
import com.polikate.steps.CheckResultsStep;
import com.polikate.steps.StartSearchStep;
import org.testng.annotations.Test;

public class SearchInfoTest extends BaseTest {

    @Test
    public void searchInfoTest() {
        StartSearchStep.getInstance().startSearch();
        CheckResultsStep.getInstance().assertThatFirstLinkUrlEqualsExpected(Url.URL_WIKI);
    }
}
