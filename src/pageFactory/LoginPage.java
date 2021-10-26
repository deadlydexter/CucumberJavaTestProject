package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final BaseClass base;

    WebDriver driver;
    public LoginPage(BaseClass base) {
        this.base = base;
    }


    By email = By.id("email");
    By password = By.id("passwd");
    By submit_btn = By.id("SubmitLogin");
    public void enterEmailAddress(String arg1) {
        driver.findElement(email).sendKeys(arg1);
    }
    public void enterPassword(String arg1) {
        driver.findElement(password).sendKeys(arg1);
        driver.findElement(submit_btn).click();
    }

}
