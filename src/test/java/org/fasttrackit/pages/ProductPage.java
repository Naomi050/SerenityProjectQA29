package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{


    @FindBy(css = " div.search-block > form > label > input")
    private WebElementFacade SearchField;

    @FindBy(css= "#post-3057 > div.post-loop-content > header > h3 > a")
    private WebElementFacade Product;

    @FindBy(id = "[title='Qty']")
    private WebElementFacade Quantity;

    @FindBy(css = "[name='add-to-cart']")
    private WebElementFacade AddtoCart;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade TextMessageElement;

    @FindBy(css = "[cols='45']")
    private WebElementFacade fieldComment;

    @FindBy(id = "#author")
    private WebElementFacade fieldName;

    @FindBy(id = "#email")
    private WebElementFacade fieldEamil;

    @FindBy(id = "#submit")
    private WebElementFacade submitButton;

    @FindBy(css = "#post-3932 > div.post-loop-content > header > h3 > a")
    private WebElementFacade Product2;




    public void setSearchField(String value){
        typeInto(SearchField,value);
    }

    public void clickOnProduct(){
        clickOn(Product);
    }
    public void setQantity(String value){
        typeInto(Quantity, value);
    }

    public void clickOnAddtoCart(){
        clickOn(AddtoCart);

    }
    public boolean isConfirmationText(String message){
        return TextMessageElement.containsOnlyText("10 × " + message + " have been added to your cart.");
    }

    public void setTextComment(String value){
        typeInto(fieldComment,value);
    }

    public void setName(String value){
        typeInto(fieldName,value);
    }

    public void setEmail(String value){
        typeInto(fieldEamil,value);
    }

    public void clickOnSubmitButton(){
        clickOn(submitButton);
    }

    public void clickOnProduct2(){
        clickOn(Product2);
    }


}
