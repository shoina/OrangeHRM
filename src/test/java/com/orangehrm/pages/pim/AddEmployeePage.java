package com.orangehrm.pages.pim;

import com.orangehrm.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

    public AddEmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@name= 'firstName']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name= 'middleName']")
    public WebElement middleNameInput;

    @FindBy(xpath = "//input[@name= 'lastName']")
    public WebElement lastNameInput;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement employeeIdInput;


    @FindBy(xpath = "//button[@type='button']")
    public WebElement cancelButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

}
