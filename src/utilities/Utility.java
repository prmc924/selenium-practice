package utilities;

import browsertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Jay Vaghani
 */
public class Utility extends BaseTest {

    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

// ******************************* Alert Methods *************************************

    /**
     * This method will switch to alert
     */
    public void switchToAlert() {
        driver.switchTo().alert().accept();
    }

    // acceptAlert()
    // dismissAlert()
    // getTextFromAlert()
    // sendTextToAlert(String text)

// ***************************** Select Class Methods *********************************

    /**
     * This method will select the option by value
     */
    public void selectByValueFromDropDown(By by, String value){
        WebElement dropdown = driver.findElement(by);
        //Create the object of Select class
        Select select = new Select(dropdown);
        // Select by visible text
        select.selectByVisibleText(value);
    }

    // selectByIndexFromDropDown(By by, int index)
    // selectByVisibleTextFromDropDown(By by, String text)
    // selectByContainsTextFroTheDropDown(By by, String text)

// ************************* Actions Methods ********************************************

    // mouseHoverToElement(By by)
    //mouseHoverToElementAndClick(By by)
}

