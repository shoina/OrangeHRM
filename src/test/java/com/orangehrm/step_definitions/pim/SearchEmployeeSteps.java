package com.orangehrm.step_definitions.pim;

import com.orangehrm.pages.pim.EmployeeListPage;
import com.orangehrm.utility.ConfigReader;
import com.orangehrm.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchEmployeeSteps {

    EmployeeListPage employeeListPage = new EmployeeListPage();

    @Given("User is on the Employee List page")
    public void user_is_on_the_employee_list_page() {
        String url = ConfigReader.getProperty("employeelist.url");
        Driver.getDriver().get(url);
    }
    @When("User enters {string} in the search input")
    public void user_enters_in_the_search_input(String string) {
        employeeListPage.employeeIdField.sendKeys("0295");
    }
    @And("User clicks on the search button")
    public void user_clicks_on_the_search_button() {
        employeeListPage.searchButton.click();
    }
    @Then("User should see {string} in the search results")
    public void user_should_see_in_the_search_results(String string) {

        Assert.assertTrue(employeeListPage.searchResultId.isDisplayed());
    }
}
