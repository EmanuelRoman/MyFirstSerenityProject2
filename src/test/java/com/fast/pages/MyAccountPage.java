package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa3.fasttrackit.org:8008")
public class MyAccountPage extends PageObject {


    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeMessageStrong;


    public boolean checkLoggedIn(){
        return welcomeMessageStrong.containsText("gbyea07 (not gbyea07? Log out)");
    }
}
