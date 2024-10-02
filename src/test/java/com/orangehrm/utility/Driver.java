package com.orangehrm.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

    public class Driver {

        private static WebDriver driver;

        // Private constructor to prevent instantiation
        private Driver() {}

        /**
         * This method initializes the WebDriver based on the browser type.
         * @param browserType - The browser name (e.g., chrome, firefox, edge).
         * @return WebDriver instance.
         */
        String browserType = ConfigReader.getProperty("browser");
        public static WebDriver getDriver() {
            if (driver == null) {  // Ensure only one instance of WebDriver is created
                String browserType = ConfigReader.getProperty("browser").toLowerCase();
                switch (browserType) {
                    case "chrome":
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        break;
                    case "firefox":
                        driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                        break;
                    case "edge":
                        driver = new EdgeDriver();
                        driver.manage().window().maximize();
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported browser type: " + browserType);
                }
                // Common setup for all browsers
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }
            return driver;
        }

        /**
         * Close the WebDriver instance.
         */
        public static void quitDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;  // Set to null to ensure a new instance can be created next time
            }
        }
    }

