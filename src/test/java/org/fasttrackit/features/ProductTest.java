package org.fasttrackit.features;

import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void SearchProducts(){
        productSteps.iconSearch();
        productSteps.searchField("aaa");
        productSteps.iconSearch2();
        productSteps.clickOnProduct();
        productSteps.clickOnAddtoCart();
        productSteps.ConfirmationMessage("aaa");
    }

    @Test
    public void EmptySearchField(){
        productSteps.iconSearch();
        productSteps.iconSearch2();
        productSteps.clickOnProduct2();
        productSteps.clickOnAddtoCart();

    }
}
