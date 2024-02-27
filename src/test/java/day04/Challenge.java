package day04;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Create a new instance of ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin() {
        // Navigate to the application URL
        driver.get("http://automationexercise.com");

        // Click on 'Signup / Login' button
        WebElement loginButton = driver.findElement(By.linkText("Signup / Login"));
        loginButton.click();

        // Enter correct email address and password
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("sda@test.com");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("sdainclasstask");

        // Click 'login' button
        WebElement loginSubmitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginSubmitButton.click();

        // Verify successful login by check the presence of a welcome message
        WebElement welcomeMessage = driver.findElement(By.className("welcome-message"));
        Assert.assertEquals("Welcome !", welcomeMessage.getText());

        // Verify user profile image is displayed
        WebElement profileImage = driver.findElement(By.className("profile-image"));
        Assert.assertTrue(profileImage.isDisplayed());

        // Wait for a while to see the result before closing the browser
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
