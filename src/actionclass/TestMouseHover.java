package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestMouseHover extends Utility {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void mouseHoverExample() {
        // Computer -----> Desktop and click
        WebElement computers =driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']"));
        WebElement desktop =driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Desktops']"));

        Actions actions = new Actions(driver);
       /* actions.moveToElement(computers).build().perform();
        actions.moveToElement(desktop).click().build().perform();*/

        actions.moveToElement(computers).moveToElement(desktop).click().build().perform();


    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
