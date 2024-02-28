package HomeWork05;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Task03 {
/*
Task:3
Launch the browser.
Open "https://demoqa.com/select-menu".
Select the Standard Multi-Select using the element id.
Verifying that the element is multi-select.
Select 'Opel' using the index and deselect the same using index.
Select 'Saab' using value and deselect the same using value.
Deselect all the options.
Close the browser
*/
static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //Open "https://demoqa.com/select-menu".
        driver.get("https://demoqa.com/select-menu");
    }
    @AfterClass
    public static void tearDown (){
        //Close the browser.
        //driver.quit();
    }
    @Test
    public void test() {
        //Select the Old Style Select Menu using the element id.
        WebElement element = driver.findElement(By.id("cars"));
        Select select = new Select(element);

        //Verifying that the element is multi-select.
        select.isMultiple();

        //Select 'Opel' using the index and deselect the same using index.
        select.selectByIndex(2);
        select.deselectByIndex(2);

        //Select 'Saab' using value and deselect the same using value.
        select.selectByValue("saab");
        select.deselectByValue("saab");

        //Deselect all the options.
        select.deselectAll();
    }

}
