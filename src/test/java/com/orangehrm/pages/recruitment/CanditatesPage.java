package com.orangehrm.pages.recruitment;

import com.orangehrm.base.BasePage;
import com.orangehrm.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CanditatesPage extends BasePage {

    public CanditatesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement fullNameInput;


    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
    private WebElement jobTitleDropdown;

    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
    private WebElement vacancyDropdown;

    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
    private WebElement hiringManagerDropdown;

    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[4]")
    private WebElement statusDropdown;


    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement keywordsInput;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement fromDateInput;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
    private WebElement toDateInput;










    }


