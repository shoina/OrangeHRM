package com.orangehrm.step_definitions.login;

import com.orangehrm.pages.login.LoginPage;
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

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
    }

    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        //p[text()='Invalid credentials']
        String expected = ConfigReader.getProperty("home.url");
        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expected, actual);
    }

}