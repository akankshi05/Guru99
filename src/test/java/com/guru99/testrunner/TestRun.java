package com.guru99.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/FeatureFiles",
        glue = "com/guru99/stepdefinitions",
        dryRun = false,
        plugin = {"pretty", "html:src/test/reports/CucumberReport"}
        //tags = "@regression"

)

public class TestRun {
}