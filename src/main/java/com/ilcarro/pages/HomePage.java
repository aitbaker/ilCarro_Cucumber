package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement homePageTitle;
    public HomePage isHomePageTitlePresent() {
        assert isElementDisplayed(homePageTitle);
        return this;
    }

    @FindBy(xpath = "//a[.=' Log in ']")
    WebElement loginLink;

    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }

    @FindBy(xpath = "//h2[.='Logged in success']")
    WebElement successMessage;

    public HomePage isSuccessMessageDisplayed() {
        assert isElementDisplayed(successMessage);
        return this;
    }

    @FindBy(xpath = "//h2[.='\"Login or Password incorrect\"']")
    WebElement errorMessage;

    public HomePage isErrorDisplayed() {
        assert isElementDisplayed(errorMessage);
        return this;
    }
}