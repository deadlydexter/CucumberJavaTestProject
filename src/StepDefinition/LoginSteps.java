package StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageFactory.BaseClass;


public class LoginSteps extends BaseClass {

    private BaseClass base;
    private String testPalindrome;
    private boolean isPalindrome;

    public LoginSteps(BaseClass base) {
        this.base = base;
    }

    @Given("^user is on Login Page$")
    public void user_is_on_Login_Page() {
        base.driver.get(base.baseURL+"/index.php?controller=authentication&back=my-account");
    }

    @When("^user has provided valid credentials$")
    public void user_has_provided_valid_credentials()  {
        base.driver.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
        base.driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
        base.driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^user should be able to login$")
    public void user_should_be_able_to_login(){
        String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String actual = base.driver.findElement(By.cssSelector(".info-account")).getText();
        Assert.assertEquals(exp_message, actual);
    }
    @Given("^I entered word \"(.*?)\"$")
    public void i_entered_word(String arg1){
        testPalindrome = arg1;
    }

    @When("^I test it for Palindrome$")
    public void i_test_it_for_Palindrome(){
        isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());

    }

    @Then("^the output should be \"(.*?)\"$")
    public void the_output_should_be(String arg1){
        boolean expectedResult = Boolean.parseBoolean(arg1);
        if (expectedResult) {
            Assert.assertTrue(isPalindrome);
            System.out.println("Test Passed"+ arg1);
        } else {
            Assert.assertFalse(isPalindrome);
            System.out.println("Test Failed"+ arg1);
        }

    }
}
