package com.orangehrm.step_definitions;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.utility.ConfigReader;
import com.orangehrm.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigReader.getProperty("login.url");
        Driver.getDriver().get(url);

    }

    @When("User enters valid username")
    public void user_enters_valid_username() {
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("username"));

    }

    @When("User enters valid password")
    public void user_enters_valid_password() {
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));

    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }

    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        //p[text()='Invalid credentials']
        String expected = ConfigReader.getProperty("home.url");
        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expected, actual);
    }

}