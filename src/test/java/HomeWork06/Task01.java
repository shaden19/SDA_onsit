package HomeWork06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task01 {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        // driver.quit();
    }

    @Test
    public void explicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //click on "Click me, to Open an alert after 5 seconds" button
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        //click on accept alert

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();


        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        //click on accept alert

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait1.until(ExpectedConditions.alertIsPresent());

        Alert alert1 = driver.switchTo().alert();
        alert.accept();


        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        //click on accept alert

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait2.until(ExpectedConditions.alertIsPresent());

        Alert alert2 = driver.switchTo().alert();
        alert.accept();



    }
}