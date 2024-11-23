package switchwindows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.Set;

/**
 * Created by Jay Vaghani
 */
public class TestSwitchWindow extends Utility {
    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchWindowExample() {
        // Get the Handle of the window
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent Window : " + parentWindowHandle);

        // Click on Open window tab
        clickOnElement(By.id("openwindow"));

        //Get all window handles
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println(allHandles);

        for (String handle : allHandles) {
            if (!handle.equals(parentWindowHandle)) {
                // Switch to window whose window handle is not equal to  parent window handle
                driver.switchTo().window(handle);
                // Click on Sigh in Link inside the window
                clickOnElement(By.xpath("//a[normalize-space()='Sign In']"));
                driver.close();
                break;
            }
        }
        //Switch the focus of driver to parent window
        driver.switchTo().window(parentWindowHandle);
        sendTextToElement(By.id("name"), "Jay");

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }

}
