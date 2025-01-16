package com.orangehrm.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;

    private Driver() {} // Private constructor

    public static WebDriver getDriver() {
        if (driver == null) {
            String browserType = ConfigReader.getProperty("browser").toLowerCase();
            switch (browserType) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browserType);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            try {
                driver.quit(); // Close all browser windows and safely terminate the session
                System.out.println("Browser closed successfully.");
            } catch (Exception e) {
                System.err.println("Error while quitting the browser: " + e.getMessage());
            } finally {
                driver = null; // Reset the driver to null
            }
        } else {
            System.out.println("Driver was already null, no action taken.");
        }
    }

}
