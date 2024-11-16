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
public class LocatorDemo3 extends BaseTest {

    String baseUrl = "https://www.letskodeit.com/login";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo3(){
        // Link Text Locator
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password?"));
        forgotPasswordLink.click();

        // Partial Link Text Locator
        driver.findElement(By.partialLinkText("in")).click();

    }

    @After
    public void tearDown(){
//        closeBrowser();
    }
}
