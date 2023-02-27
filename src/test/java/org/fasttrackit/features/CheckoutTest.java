package org.fasttrackit.features;

import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void CheckoutTest(){
        checkoutSteps.clickOnCheckout();
        checkoutSteps.typeFirstName("Julya");
        checkoutSteps.typeLastName("Mary");
        checkoutSteps.typeAddress("Nr.43");
        checkoutSteps.typeCity("Cluj");
        checkoutSteps.typePostcode("456732");
        checkoutSteps.clickOnsubmitButton();
        checkoutSteps.ErrorMessage("Billing Phone");
        }


    }

