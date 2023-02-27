package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy(css = "[title='Login']")
    private WebElementFacade MyAccountElement;


    @FindBy(id = "#menu-item-1643 > a")
    private WebElementFacade BlogElement;

    @FindBy(id = "i.fa.fa-shopping-cart")
    private WebElementFacade ShopElement;

    @FindBy(css = "i.search-btn")
    private WebElementFacade IconSearch;

    @FindBy(css = " div.search-block > form > label > input")
    private WebElementFacade SearchField;

    @FindBy(css = "div.search-block > form > input")
    private WebElementFacade IconSearch2;



    public void clickOnMyAccountElement() {
        clickOn(MyAccountElement);
    }

    public void clickOnBlogElement() {
        clickOn(BlogElement);
    }
    public void clickOnShopElement(){
        clickOn(ShopElement);
    }

    public void clickOnIconSearch(){
        clickOn(IconSearch);
    }

    public void setSearchField(String value) {
        typeInto(SearchField, value);

    }

    public void clickOnIconSearch2(){
        clickOn(IconSearch2);

    }

}
