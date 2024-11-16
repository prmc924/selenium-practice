package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo5 extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo5() throws InterruptedException {
        //Relative xpath
        //tagName[@attribute='value']
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");

        //xpath with or
       //tagName[@attribute='value' or @attribute='value']
        driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='q']")).sendKeys("Mobile");

        // xpath with end
        //tagName[@attribute='value' and @attribute='value']
        driver.findElement(By.xpath("//input[@id='small-searchterms' and @name='q']")).sendKeys("Mobile");

        //xpath with starts-with()
        //tagName[starts-with(@attribute, 'value')]
        driver.findElement(By.xpath("//input[starts-with(@id, 'small')]")).sendKeys("Mobile");

        //xpath with contains()
        //tagName[contains(@attribute, 'value')]
        //input[contains(@id, 'terms')]

        // xpath with text()
        // tagName[text() = 'value']
        driver.findElement(By.xpath("//a[text() = 'Log in']")).click();

        //xpath with chained
        //div[@class='header-menu']//a[text()= 'Books ']
    }

    @After
    public void tearDown(){
//        closeBrowser();
    }
}
