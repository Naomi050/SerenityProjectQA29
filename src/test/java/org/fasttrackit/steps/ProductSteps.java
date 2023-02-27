package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class ProductSteps extends BaseSteps{


    private HomePage homePage;
    private ProductPage productPage;

    @Step
    public void iconSearch(){
        homePage.clickOnIconSearch();
    }

    @Step
    public void searchField(String product){
        homePage.setSearchField(product);
    }

    @Step
    public void iconSearch2(){
        homePage.clickOnIconSearch2();
    }

    @Step
    public void clickOnProduct(){
        productPage.clickOnProduct();
    }

    @Step
    public void typeQuantity(String qty){
        productPage.setQantity(qty);
    }

    @Step
    public void clickOnAddtoCart(){
        productPage.clickOnAddtoCart();
    }

    @Step
    public void ConfirmationMessage(String message){
        Assert.assertFalse(productPage.isConfirmationText(message));
    }



    @Step
    public void typeComment(String comment){
        productPage.setTextComment(comment);
    }

    @Step
    public void typeName(String name){
        productPage.setName(name);
    }
    @Step
    public void typeEmail(String email){
        productPage.setEmail(email);
    }
    @Step
    public void clickOnSubmitButton(){
        productPage.clickOnSubmitButton();
    }

    @Step
    public void clickOnProduct2(){
        productPage.clickOnProduct2();
    }

}
