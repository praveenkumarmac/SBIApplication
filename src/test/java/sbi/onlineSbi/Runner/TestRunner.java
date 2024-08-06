package sbi.onlineSbi.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\user\\eclipse-workspace\\praveen\\SbiApplication\\src\\test\\resources\\FeatureFiles",
                     glue = {"sbi.onlineSbi.StepDefinition","sbi.onlineSbi.Hooks"},
                     dryRun = false,
                     monochrome = false
                     )
public class TestRunner {

	
}
