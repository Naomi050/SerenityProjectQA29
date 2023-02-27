package org.fasttrackit.features;


import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class MyAccountTest extends BaseTest{





    @Test
    public void ValidLoginTest() {
        myAccountSteps.NavigateToHomePage();
        myAccountSteps.typeUserEmail(Constants.USER_EMAIL);
        myAccountSteps.typePassword(Constants.PASS);
        myAccountSteps.clickRegister();
    }


    @Test
    public void invalidLoginTest() {
        myAccountSteps.NavigateToHomePage();
        myAccountSteps.typeUserEmail("julya.austen.yahoo.com");
        myAccountSteps.typePassword(Constants.PASS);
        myAccountSteps.clickRegister();
    }

    @Test
    public void invalidPasswordLoginTest(){
        myAccountSteps.NavigateToHomePage();
        myAccountSteps.typeUserEmail(Constants.USER_EMAIL);
        myAccountSteps.typePassword("1234567890");
        myAccountSteps.clickRegister();

    }

// @Test
//   public void emptyFields(){
//        myAccountSteps.NavigateToHomePage();
//        myAccountSteps.clickRegister();
//        myAccountSteps.isErrorMessage(" Username is required.");
//





   }





