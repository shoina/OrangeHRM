package com.orangehrm.test_runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/cucumber.html",
                "json:target/cucumber.json",
                "rerun:target/reran.txt"
        },
        features = "src/test/resources/features",
        glue = "com/orangehrm/step_definitions",
        dryRun = false,
        tags = "@login"
)



public class TestRunner {



}
