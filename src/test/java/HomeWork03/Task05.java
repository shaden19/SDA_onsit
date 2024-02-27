package HomeWork03;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task05 {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
    }

    @Test
    public void testAbsoluteXPath() {
        WebElement emailOrPhoneAbsolute = driver.findElement
                (By.xpath("/html/body/div/main/div[2]/div[1]/form/div[1]/input"));

        Assert.assertTrue(emailOrPhoneAbsolute.isDisplayed());
    }

    @Test
    public void testRelativeXPath() {
        WebElement signInButtonRelative = driver.findElement(By.xpath("//button[@type='submit']"));

        Assert.assertTrue(signInButtonRelative.isDisplayed());
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
