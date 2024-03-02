package HomeWork06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task02 {

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
        driver.get("https://the-internet.herokuapp.com/basic_auth");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait1.until(ExpectedConditions.alertIsPresent());

        Alert alert1 = driver.switchTo().alert();

        alert1.sendKeys("admin" + "\t" + "admin");
        alert1.accept();
    }
}