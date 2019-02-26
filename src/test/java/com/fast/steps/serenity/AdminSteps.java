package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class AdminSteps extends ScenarioSteps {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage(){

        homePage.open();
    }

    @Step
    public void goToLogin(){

        homePage.clicklogInLink ();
    }

    @Step
    public void setUser(){

        loginPage.setEmailField();
    }

    @Step
    public void setPassword() {

        loginPage.setPasswordField ();
    }

    @Step
    public void clickOnloginButton(){

        loginPage.clickOnloginButton();
    }
    @StepGroup
    public void login(){
        navigateToHomepage();
        goToLogin();
        setUser();
        setPassword();
        clickOnLoginButton();
        checkLoggedIn();
    }

    private void checkLoggedIn() {
    }

    private void clickOnLoginButton() {
    }
    @Step
    public void clickOnHowddyAdminLink(){


    }

}
