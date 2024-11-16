package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo4 extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo4(){
        // Class Name Locator ---> To find multiple elements
        List<WebElement> sliderElements = driver.findElements(By.className("nivo-imageLink"));
        System.out.println("Total slides are : " + sliderElements.size());

        // Tag Name Locator ---> To find multiple elements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links : " + links.size());
        for (WebElement link :links){
            System.out.println(link.getText());
        }

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
