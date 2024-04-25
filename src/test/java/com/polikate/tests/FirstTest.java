package com.polikate.tests;

import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void firstTest() {
        new Steps().startSearch();
        new Steps().checkResult();

    }
}
