package HomeWork06;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class challenge {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void explicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        //click on "Click me, to Open an alert after 5 seconds" button
        driver.findElement(By.id("alert")).click();

        //click on accept alert

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.id("populate-text")).click();

        //click on "Change Text to Selenium Webdriver"
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait2.until(ExpectedConditions.textToBePresentInElementLocated(By.id("h2"), "Selenium Webdriver"));

        //verify "Selenium Webdriver" message is displayed

        Assert.assertTrue(driver.findElement(By.id("h2")).getText().equals("Selenium Webdriver"));

        //click on "Display button after 10 seconds" button

        driver.findElement(By.id("display-other-button")).click();

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait3.until(ExpectedConditions.elementToBeClickable(By.id("hidden")));

        // verify the button is displayed

        Assert.assertTrue(driver.findElement(By.id("hidden")).isDisplayed());

        // click on "Enable button after 10 seconds" button

        driver.findElement(By.id("enable-button")).click();

        // verify the button is enabled

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait4.until(ExpectedConditions.elementToBeClickable(By.id("disable")));

        //click on "Check Checkbox after 10 seconds" button
        //11. verify the check box is checked

        Assert.assertTrue(driver.findElement(By.id("disable")).isEnabled());

        driver.findElement(By.id("checkbox")).click();

        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait5.until(ExpectedConditions.elementToBeSelected(By.id("ch")));

        Assert.assertTrue(driver.findElement(By.id("ch")).isSelected());



    }
}