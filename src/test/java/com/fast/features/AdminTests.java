package com.fast.features;

import com.fast.steps.serenity.AdminSteps;
import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AdminTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;
    AdminSteps adminSteps;

    @Test
    public void validLoginAdminTest() {
        loginSteps.navigateToHomepage ();
        loginSteps.goToLogin ();
        loginSteps.validAdminCharacters ();
        loginSteps.clickLoginButton ();
        loginSteps.clickOnMyAccountButton ();

    }

    @Test
    public void addAProduct() {
      //  loginSteps.login ();
        loginSteps.navigateToHomepage ();
        loginSteps.goToLogin ();
        loginSteps.validAdminCharacters ();
        loginSteps.clickLoginButton ();
        loginSteps.clickOnMyAccountButton ();
        loginSteps.clickOnHowddyAdminLink ();

    }

}
