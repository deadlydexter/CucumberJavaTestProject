package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", 
									glue = { "StepDefinition" }, 
									tags = { "@UpdateProfile" }, 
									plugin = { "html:target/cucumber-reports/cucumber-pretty","html:target/cucumber-html-report" })
public class Runner {

}
