package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.BlogPage;
import org.fasttrackit.pages.HomePage;

public class BlogSteps extends BaseSteps {

    private HomePage homePage;
    private BlogPage blogPage;

    @Step
    public void BlogElement(){
        homePage.clickOnBlogElement();
    }
    @Step
    public void typeComment(String comment){
        blogPage.setCommentField(comment);
    }

    @Step
    public void typeName(String name){
        blogPage.setNameField(name);
    }

    @Step
    public void typeUserEmail(String email){
        blogPage.setEmailField(email);
    }

    @Step
    public void typeWebsite(String site){
        blogPage.setWebSiteElement(site);
    }

    @Step
    public void ClickOnButton(){
        blogPage.clickOnPostComment();
    }
}

