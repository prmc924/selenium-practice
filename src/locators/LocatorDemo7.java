package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo7 extends BaseTest {

    String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo7() {
        // Click on consent tab

        // Self --- Select the Current Node


        // Parent  --- Selection the parent of the current node (always one)


        // Child --- Select the children of current node (one or many)


        // Ancestor --- Select all ancestors (parent grandparent etc)


        // Descendant -- Select all descendants (children, grand children etc)

        // Following  -- Select everything in document after the closing tag of the current node


        // Following-Sibling  -- Select all siblings after the current node


        // Preceding -- Select all nodes that appear before the current node in the document


        // Preceding-sibling -- Select all siblings before the current node

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
