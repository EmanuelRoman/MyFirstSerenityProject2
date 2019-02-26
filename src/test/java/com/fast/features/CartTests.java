package com.fast.features;

import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class  CartTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    CartSteps cartSteps;

    @Test
    public void UpdateCart() {
        loginSteps.login();
        cartSteps.clickOnQuantityButton ();
        cartSteps.pushOnUpdateButton ();
        cartSteps.clickOnProceedToCheckoutButton ();
        cartSteps.clickOnAddToCartButton ();
        cartSteps.pushOnAddToCartButton();
    }

}
