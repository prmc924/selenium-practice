package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demowebshop.tricentis.com/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into Browser
        driver.get(baseUrl);
        //Maximise the Browser window
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Get Current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url " + currentUrl);

        // Get Page Source
        System.out.println("The page Source : " + driver.getPageSource());

        String loginUrl = "https://demowebshop.tricentis.com/login";
        driver.navigate().to(loginUrl);

        System.out.println("Get Current URl :" + driver.getCurrentUrl());

        // Navigate Back
        driver.navigate().back();
        System.out.println("Get Current URl :" + driver.getCurrentUrl());

        // Refresh the page
        driver.navigate().refresh();

        // Forward the page
        driver.navigate().forward();
        System.out.println("Get Current URl :" + driver.getCurrentUrl());



        //Close the Browser
//        driver.quit();

    }
}
