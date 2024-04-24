package com.polikate.tests;

import org.testng.annotations.Test;


public class FirstTest extends Steps {
    
    @Test
    public void firstTest() {
        startSearch();
        checkResult();
    }
}
