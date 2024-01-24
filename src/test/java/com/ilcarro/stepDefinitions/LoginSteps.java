package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;


public class LoginSteps {

    @And("User clicks on Log in link")
    public void click_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enters_valid_data() {
        new LoginPage(driver).enterValidData("neuer+1@gm.com","Manuel1234!");
    }

    @And("User clicks on Yalla button")
    public void click_on_Yalla_button() {
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("User verifies Success log in")
    public void verify_Success_login() {

        new HomePage(driver).isSuccessMessageDisplayed();
    }

    @And("User quites browser")
    public void quit_browser(){
        new HomePage(driver).quiteBrowser();
    }

    @And("User enters valid email and wrong password")
    public void enter_valid_email_wrong_password(DataTable table) {
        new LoginPage(driver).enterWrongPassword(table);
    }

    @Then("User verifies error is displayed")
    public void verify_error() {
        new HomePage(driver).isErrorDisplayed();
    }
}
