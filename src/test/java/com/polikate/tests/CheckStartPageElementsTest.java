package com.polikate.tests;

import com.polikate.steps.FindLogoStep;
import org.testng.annotations.Test;

public class CheckStartPageElementsTest extends BaseTest {

    @Test
    public void checkStartPageTest() {
        FindLogoStep.getInstance().FindLogo();
    }
}
