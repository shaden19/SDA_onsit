package HW.homeWorks;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class challenge01 {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterClass
    public static void tearDown(){

       // driver.quit();
    }

    @Test
    public void test() {
        driver.get("http://automationexercise.com");
        WebElement logo =driver.findElement(By.id("footer"));
        assertTrue(logo.isDisplayed());

    }

    @Test
    public void EnterEmailAndPass() {
        //driver.findElement(By.cssSelector("button[type='submit']")).click();
        //driver.findElement(By.name("email")).sendKeys("sda@test.com");
        //driver.findElement(By.name("password")).sendKeys("sdainclasstask");

    }


}
