package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://http://qa3.fasttrackit.org:8008/my-account/")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "login")
    private WebElementFacade loginButton;


    public void setEmailField(){
        waitFor(emailField);
        typeInto(emailField,"gbyea07@gmail.com");
    }

    public void setPasswordField(){
        typeInto(passwordField, "parolaexamen");
    }

    public void invalidCharacters(){
        typeInto (emailField,"asada@sepoate.com");
        typeInto (passwordField, "parol");

    }


    public void clickLoginButton(){
        clickOn(loginButton, "login");
    }

    private void clickOn(WebElementFacade loginButton, String login) {
    }



    public void clickOnloginButton() {
    }




    public void validAdminCharachters() {
        waitFor (emailField);
        typeInto (emailField, "admin");
        waitFor (passwordField);
        typeInto (passwordField, "parola11");
    }


    public void setLoginButton(WebElementFacade loginButton) {
        this.loginButton = loginButton;
    }
}

