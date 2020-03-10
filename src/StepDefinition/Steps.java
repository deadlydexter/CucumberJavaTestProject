package StepDefinition;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.chrome.driver", "C:\\java_libs\\chromedriver.exe");					
       driver = new ChromeDriver();			
       driver.manage().window().maximize();			
       driver.get("http://demo.guru99.com/v4");					
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.name("uid")).sendKeys("username12");							
       driver.findElement(By.name("password")).sendKeys("password12");							
    }	
    
    @When("^Enter the Username User(-?\\d+) and Password password(-?\\d+)$")
    public void Enter_the_Username_user_and_Password_password(String arg1, String arg2) throws Throwable {
    	driver.findElement(By.name("uid")).sendKeys(arg1);					
        driver.findElement(By.name("password")).sendKeys(arg2);					
    }

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();		
       driver.close();
    }		
 
}	
