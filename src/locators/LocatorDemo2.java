package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo2 extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo2(){
        //Link Text Locator
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Find Email Field Element ID Locator
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime123@gmail.com");

        //Find Password Field Element Using name Locator
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Prime123");

    }

    @After
    public void tearDown(){
//        closeBrowser();
    }
}
