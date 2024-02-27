package HomeWork03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task04 {
    /*
     Task 4:
Navigate to https://testpages.herokuapp.com/styled/index.html
Click on Simple Calculator under Micro Apps.
Type any number in the first input.
Type any number in the second input.
Click on Calculate.
Get the result.
Print the result.
     */
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //Navigate to https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

    }

    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

    @Test
    public void testEnterValue(){
        //Type any number in the first input.
        driver.findElement(By.id("calculatetest")).click();

        driver.findElement(By.id("number1")).sendKeys("12");
        //Type any number in the second input.
        driver.findElement(By.id("number2")).sendKeys("1");
        //Click on Calculate.
        driver.findElement(By.id("calculate")).click();
        //Get the result.
        String totalResult = driver.findElement(By.id("answer")).getText();
        //Print the result.
        System.out.println("totalResult = " + totalResult);
    }

}
