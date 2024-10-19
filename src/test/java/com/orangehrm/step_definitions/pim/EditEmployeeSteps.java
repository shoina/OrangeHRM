package com.orangehrm.step_definitions.pim;

import com.orangehrm.pages.pim.EmployeeListPage;
import com.orangehrm.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditEmployeeSteps {
    EmployeeListPage employeeListPage = new EmployeeListPage();


    @When("User clicks on the edit button for employee with {}")
    public void user_clicks_on_the_edit_button_for_employee_with() {
       employeeListPage.search("1234");
       employeeListPage.editButton.click();
    }
    @And("User is able to edit the employee's information")
    public void user_is_able_to_edit_the_employee_s_information() {
        String actual = Driver.getDriver().getCurrentUrl();
        System.out.println("Current URL: " + actual);
        String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/";
        Assert.assertTrue("The URL does not match the expected format", actual.contains(expected));
    }
    @Then("User is able to save the changes")
    public void user_is_able_to_save_the_changes() {
        employeeListPage.saveChangesButton.click();
    }


}
