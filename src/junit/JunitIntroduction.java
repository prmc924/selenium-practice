package junit;

import org.junit.*;

/**
 * Created by Jay Vaghani
 */

public class JunitIntroduction {
 @BeforeClass
    public static void connectWithDB(){
        System.out.println("DB connection");
    }

    @AfterClass
    public static void closedDBConnection(){
        System.out.println("Close DB connection");
    }

    @Before
    public void openBrowser() {
        System.out.println("Opening the browser");
    }

    @After
    public void closeBrowser(){
        System.out.println("closing the browser");
    }

    @Test
    public void verifyUserShouldNavigateTiLoginPageSuccessfully() {
        System.out.println("Navigate to Login Page");
        Assert.assertTrue(true);
    }

    @Test
    public void test() {
        System.out.println("This is test method");
        Assert.assertEquals("Prime", "Prime");
    }
}
