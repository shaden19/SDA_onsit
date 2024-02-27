package HomeWork04;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class challenge {


    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Assert.assertTrue(driver.getTitle().contains("To-Do List"));
    }
    @AfterClass
    public static void tearDown(){
        // driver.quit();

    }

    @Test
    public void test(){
        By textField = RelativeLocator.with(By.xpath("//*[@type='text']"));
        driver.findElement(textField).sendKeys("Rand"+ Keys.ENTER);
        // Assert.assertTrue();

        By deleteField = RelativeLocator.with(By.xpath("//*[@id=\"container\"]/ul/li[4]/span/i"));
        driver.findElement(deleteField).click();
        //Assert.assertTrue();
    }
}