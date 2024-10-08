package com.orangehrm.pages;

import com.orangehrm.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@name ='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name ='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type ='submit']")
    public WebElement loginButton;

    
}
