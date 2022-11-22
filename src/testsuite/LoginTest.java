package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.UtilitiesMain;

public class LoginTest extends UtilitiesMain {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Send Keys to Log in field
        // Enter username in field
        sendTextToElement(By.name("username"), "Admin");

        // Enter password field
        sendTextToElement(By.name("password"), "admin123");

        // Click on login button
        clickOnElement(By.xpath("//button[@type='submit']"));

        String expectedMessage = "Paul Collings";

        String actualTextMessage = getTextFromElement(By.xpath("//a[text() = 'Paul Collings']"));

        //Validate actual and expected message
        Assert.assertEquals("Paul Collings", expectedMessage, actualTextMessage);


    }


}
