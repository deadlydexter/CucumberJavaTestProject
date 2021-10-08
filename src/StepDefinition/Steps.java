package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





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
    
    
    @Given("^I entered word \"(.*?)\"$")
    public void i_entered_word(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
    }

    @When("^I test it for Palindrome$")
    public void i_test_it_for_Palindrome() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Palindrome");
    }

    @Then("^the output should be \"(.*?)\"$")
    public void the_output_should_be(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(arg1);
    }
    
    

 
}	
