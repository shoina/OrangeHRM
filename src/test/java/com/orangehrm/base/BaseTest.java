package com.orangehrm.base;

import com.orangehrm.utility.Driver;
import org.junit.After;
import org.junit.Before;

public abstract class BaseTest {
    @Before
    public void setUp() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com");
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}

