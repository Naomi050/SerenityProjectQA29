package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps{


    @Step
    public void clickOnCheckout(){
        checkoutPage.clickOnCheckout();
    }

    @Step
    public void typeFirstName(String name){
        checkoutPage.setFirstName(name);
    }
    @Step
    public void typeLastName(String name2){
        checkoutPage.setLastName(name2);
    }
    @Step
    public void typeAddress(String address){
        checkoutPage.setAddress(address);
    }
    @Step
    public void typeCity(String city){
        checkoutPage.setCity(city);
    }
    @Step
    public void typePostcode(String postcode){
        checkoutPage.setPostcode(postcode);
    }
    @Step
    public void clickOnsubmitButton(){
        checkoutPage.clickOnButton();
    }

    @Step
    public void ErrorMessage(String message){
        Assert.assertTrue(checkoutPage.isErrorMessage(message));

    }
}
