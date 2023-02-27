package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage{

   @FindBy(css =" [name='comment']")
    private WebElementFacade CommentField;


   @FindBy(id = "#author")
    private WebElementFacade NameField;

   @FindBy(id = "#email")
    private WebElementFacade EmailField;

   @FindBy(id="#url")
    private WebElementFacade WebSiteElement;

   @FindBy(id="#submit")
    private WebElementFacade PostCommentElement;


   public void setCommentField(String value) {
       typeInto(CommentField, value);
   }


       public void setNameField(String value){
       typeInto(NameField,value);
   }

   public void setEmailField(String value){
       typeInto(EmailField,value);
   }

   public void setWebSiteElement(String value){
       typeInto(WebSiteElement,value);
   }

   public void clickOnPostComment(){
       clickOn(PostCommentElement);
   }

}
