package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

import org.fasttrackit.features.BaseTest;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;
;

public class MyAccountSteps extends BaseSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;


    @Step
    public void NavigateToHomePage(){
    homePage.clickOnMyAccountElement();

    }

    @Step
    public void typeUserEmail(String email){
        myAccountPage.setEmailfield(email);
    }

    @Step
    public void typePassword(String password){
        myAccountPage.setPasswordfield(password);
    }

    @Step
    public void clickRegister(){
        myAccountPage.clickButton();

    }

    public void isErrorMessage(String message){
        Assert.assertTrue(myAccountPage.errorMessage(message));
      }
}
