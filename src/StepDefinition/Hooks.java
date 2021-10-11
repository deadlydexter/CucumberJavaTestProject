package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.BaseClass;

import java.util.concurrent.TimeUnit;


public class Hooks extends BaseClass {

    private BaseClass base;

    public Hooks(BaseClass base) {
        this.base = base;
    }

    @Before("@UI")
    public void initDriver() {
        System.out.println("Open browser");
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\install\\dir\\chromedriver.exe");
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After("@UI")
    public void teardown() {
        System.out.println("Close browser");
        base.driver.quit();
    }
    @Before("@NON-UI")
    public void setUpNonUITests() {
        System.out.println("This is a NON-UI Tests - Dont initialize Browser");

    }

    @After("@NON-UI")
    public void tearDownNonUITests() {
        System.out.println("Non-UI Test complete");

    }
}
