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
import java.util.List;

public class Task02 {
/*
Task:2
Launch the browser.
Open "https://demoqa.com/select-menu".
Select the Old Style Select Menu using the element id.
Print all the options of the dropdown.
Select 'Purple' using the index.
After that, select 'Magenta' using visible text.
Select an option using value.
Close the browser.
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
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(element);

        //Print all the options of the dropdown.
        List<WebElement> options = select.getOptions();
        for (WebElement option:options){
            System.out.println(option.getText());
        }

        //Select 'Purple' using the index.
        select.selectByIndex(4);

        //After that, select 'Magenta' using visible text.
        select.selectByVisibleText("Magenta");

        //Select an option using value. -> I select Aqua
        select.selectByValue("10");


    }

}
