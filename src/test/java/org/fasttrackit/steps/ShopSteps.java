package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;

public class ShopSteps extends BaseSteps{

    private HomePage homePage;

    @Step
    public void shopElement(){
        homePage.clickOnShopElement();
    }
}
