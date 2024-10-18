package com.orangehrm.pages.pim;

import com.orangehrm.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage {

    public EmployeeListPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//input[placeholder= 'Type for hints...']")
    public WebElement fullNameField;

    @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement employeeIdField;

    @FindBy (xpath = "//button[@type ='submit']")
    public WebElement searchButton;

    @FindBy (xpath = "//div[@class='oxd-table-cell oxd-padding-cell']//div[text()='0295']")
    public WebElement searchResultId;






}





