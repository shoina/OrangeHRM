package com.orangehrm.step_definitions.pim;

import com.orangehrm.pages.login.LoginPage;
import com.orangehrm.pages.pim.AddEmployeePage;
import com.orangehrm.utility.ConfigReader;
import com.orangehrm.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddEmployeeSteps {

    AddEmployeePage addEmployeePage = new AddEmployeePage();

    @Given("User is on add employee page")
    public void user_is_on_add_employee_page() {
        String url = ConfigReader.getProperty("addEmployee.url");
        Driver.getDriver().get(url);
    }

    @When("User enters valid firstname")
    public void user_enters_valid_firstname() {
        addEmployeePage.firstNameInput.sendKeys("username7");
    }

    @When("User enters valid middlename")
    public void user_enters_valid_middlename() {
        addEmployeePage.middleNameInput.sendKeys("es");

    }

    @When("User enters valid lastname")
    public void user_enters_valid_lastname() {
        addEmployeePage.lastNameInput.sendKeys("test");

    }

    @When("User enters valid id")
    public void user_enters_valid_id() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(addEmployeePage.employeeIdInput)
                .click()
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .sendKeys("0123578")
                .perform();


    }

    @When("User clicks on save button")
    public void user_clicks_on_save_button() {
        addEmployeePage.saveButton.click();
    }

    @Then("User should be saved")
    public void user_should_be_saved() {
        // Add a short sleep to ensure the page has fully loaded before checking the URL
        try {
            Thread.sleep(10000);  // Wait for 5 seconds before checking the URL
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the current URL and log it to verify
        String actual = Driver.getDriver().getCurrentUrl();
        System.out.println("Current URL: " + actual);  // Print the current URL for debugging

        // Define the static part of the expected URL
        String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/";

        // Assert that the actual URL contains the static part
        Assert.assertTrue("The URL does not match the expected format", actual.contains(expected));
    }
}





