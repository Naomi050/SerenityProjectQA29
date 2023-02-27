package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class
CheckoutPage extends BasePage {

    @FindBy(id = "#menu-item-1729 > a")
    private WebElementFacade checkoutElement;

    @FindBy(id = "#billing_first_name")
    private WebElementFacade FirstNamefield;

    @FindBy(id = "#billing_last_name")
    private WebElementFacade LastNamefield;

    @FindBy(css = "[name='billing_address_1']")
    private WebElementFacade Addressfield;

    @FindBy(css = "[name='billing_city']")
    private WebElementFacade Cityfield;

    @FindBy(css = "[name='billing_postcode']")
    private WebElementFacade Postcodefield;

    @FindBy(css ="[name='billing_email']")
    private WebElementFacade Emailfield;

    @FindBy(css = ".button.alt")
    private WebElementFacade buttonElement;

    @FindBy(css = ".woocommerce-NoticeGroup-checkout > ul > li:nth-child(1) > strong")
    private WebElementFacade textMessageElement;




    public void setFirstName(String value){
        typeInto(FirstNamefield,value);
    }
    public void setLastName(String value){
        typeInto(LastNamefield, value);
    }
    public void setAddress(String value){
        typeInto(Addressfield,value);
    }
    public void setCity(String value){
        typeInto(Cityfield,value);
    }
    public void setPostcode(String value){
        typeInto(Postcodefield, value);
    }
    public void clickOnButton(){
        clickOn(buttonElement);
    }
    public void clickOnCheckout(){
        clickOn(checkoutElement);
    }

    public boolean isErrorMessage(String message){
       return textMessageElement.containsOnlyText(" " +message+ " is a required field.");
    }


}
