package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends BasePage {

    @FindBy(css = "[name='username']")
    private WebElementFacade emailfield;

    @FindBy(css= "[id='password']")
    private WebElementFacade passwordfield;

    @FindBy(css = "[name='login']")
    private WebElementFacade LoginButton;

    @FindBy(css = "#post-13 > div > div > ul > li")
    private WebElementFacade textMessageEleemnt;


    public void setEmailfield(String value){
        typeInto(emailfield,value);
    }



    public void setPasswordfield(String value){
        typeInto(passwordfield,value);
    }

    public void clickButton(){
        clickOn(LoginButton);
    }

    public boolean errorMessage(String message){
        return textMessageEleemnt.containsOnlyText("Error: " +message+ " ");


    }


}
