package com.orangehrm.step_definitions.pim;

import com.orangehrm.pages.pim.EmployeeListPage;
import com.orangehrm.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DeleteEmployeeSteps {
    EmployeeListPage employeeListPage = new EmployeeListPage();
    @When("User clicks on the delete button for employee with ID {string}")
    public void user_clicks_on_the_delete_button_for_employee_with_id(String employeeId) {
        employeeListPage.search(employeeId);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement deleteButton = employeeListPage.getDeleteButton(employeeId);
        deleteButton.click();

        // Wait for the delete confirmation window (or button) to appear
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement confirmationWindow = wait.until(ExpectedConditions.visibilityOf(employeeListPage.yesDeleteButton));
        confirmationWindow.click();


    }
    // setTimeout(function() { debugger; }, 5000);
    @Then("User is able to see confirmation message with text {string}")
    public void user_is_able_to_see_confirmation_message_with_text(String action) {
        // Get the WebElement for the confirmation message
        WebElement confirmMessage = employeeListPage.getConfirmationMessage(action);

        // Wait for the confirmation message to be visible
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        WebElement notification = wait.until(ExpectedConditions.visibilityOf(confirmMessage));

        // You can now perform additional checks on the notification if needed
        String notificationText = notification.getText();
        Assert.assertTrue(notificationText.contains("Successfully Deleted"));
    }






}
