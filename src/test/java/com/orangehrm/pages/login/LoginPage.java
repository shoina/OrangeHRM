package com.orangehrm.pages.login;

import com.orangehrm.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.orangehrm.utility.Driver;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@name ='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@name ='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type ='submit']")
    private WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(String username, String password) {
        sendKeys(usernameInput, username);
        sendKeys(passwordInput, password);
        click(loginButton);
    }
}

