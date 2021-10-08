package TestRunner;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "StepDefinition" }, tags = "@UpdateProfile" , plugin = {
		"html:target/cucumber-html-report/report.html" })
public class Runner {

}
