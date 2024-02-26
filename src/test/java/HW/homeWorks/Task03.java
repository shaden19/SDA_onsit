package HW.homeWorks;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Task03 {
    /*
    Task 3:
Enter an e-mail address.
Enter a password.
Click on the Login button.
There was a problem with your login.
If text is visible, print "Registration Failed".
If the text is not visible, print "Registered".
Close all pages.
*/
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //Go to https://id.heroku.com/login.
        driver.get("https://id.heroku.com/login");

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }


    @Test
    public void testEnterEmail(){
        //Enter an e-mail address.
        driver.findElement(By.id("email")).sendKeys("shXXXXX0111@gmail.com");
    }

    @Test
    public void testEnterPassword(){
        //Enter a password.
        driver.findElement(By.id("password")).sendKeys("1234");
        //Click on the Login button.
        driver.findElement(By.name("commit")).click();
    }



}

