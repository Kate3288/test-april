package com.polikate.steps;

import com.polikate.pages.BeginSearchPage;

public class FindLogoStep {

    private static final FindLogoStep FIND_LOGO_STEP = new FindLogoStep();

    public static FindLogoStep getInstance() {
        return FIND_LOGO_STEP;
    }
    public void FindLogo() {
        BeginSearchPage.getInstance().checkLogoOnThePage();
    }
}
