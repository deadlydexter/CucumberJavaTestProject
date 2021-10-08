# Cucumber-Java Test Framework.

## Project Setup using eclipse
- Create Project in eclipse
    - Create ```Java project``` with the name "CucumberWithSelenium".
    - Add following jars to the project build path
        + Selenium-server-standalone
        + Cucumber-core - 1.2.2
        + Cucumber-html
        + Cobertura code coverage
        + Cucumber-java
        + Cucumber-junit
        + Cucumber-jvm-deps
        + Cucumber-reporting
        + Hemcrest-core
        + Gherkin
        + Junit
      
    - Create a Feature file
        + Create a ```features``` folder in the root directory and create a ```MyTest.feature``` file.
        + Install the Cucumber Eclipse Plugin by Going to -- Helps->Install New Software-> ```cucumber plugin```
    - Create a Runner File
        + ``` Java
	          package TestRunner;		
	          
	          import org.junit.runner.RunWith;		
	          import cucumber.api.CucumberOptions;		
	          import cucumber.api.junit.Cucumber;		
	          
	          @RunWith(Cucumber.class)				
	          @CucumberOptions(features="Features",glue={"StepDefinition"})						
	          public class Runner 				
	          {		
	          
	          }
        	```
      
     - Create step definitions file 
        + Create a 'StepDefinition' package and then ```Steps.java``` script file in it.
     - Running the Test
        + Right click on the runner script ```Runner.java``` and run as JUnit Test.
          