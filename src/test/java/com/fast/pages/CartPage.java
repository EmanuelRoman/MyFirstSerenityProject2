package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl ("http://qa3.fasttrackit.org:8008/cart")
public class CartPage extends PageObject {


    @FindBy(css = "#quantity_5c7043575c9b5")
    private WebElementFacade inputQuantity;

    public void clickOnQuantityButton() {
    }

    @FindBy(css = "update_cart")
    private WebElementFacade updateCart;

    public void pushOnUpdateCartButton() {

    }
    @FindBy(css = "a.checkout-button")
    private WebElementFacade clickOnProceedToCheckoutButton;

    public void clickOnProceedToCheckoutButton(){

    }

    @FindBy(css = "woo-beanie")
    private WebElementFacade clickOnAddToCartButton;

    public void ClickOnAddToCartButton() {

    }

    @FindBy(css = "single_add_to_cart_button")
    private WebElementFacade pushOnAddToCartButton;

    public void setPushOnAddToCartButton(){

    }
    }




