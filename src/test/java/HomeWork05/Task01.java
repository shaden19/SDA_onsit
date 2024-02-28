package HomeWork05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Task01 {
/*
Go to URL: https://the-internet.herokuapp.com/dropdown
Select Option 1 using index .
Select Option 2 by value.
Select Option 1 value by visible text.
Print all dropdown value.
Verify the dropdown has Option 2 text.
Print first selected option.
Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
*/
static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }
    @AfterClass
    public static void tearDown (){
        //driver.quit();
    }
    @Test
    public void test() {
        //Select Option 1 using index .
        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        select.selectByIndex(1);

        //Select Option 2 by value.
        select.selectByValue("2");

        //Select Option 1 value by visible text.
        select.selectByVisibleText("Option 1");

        //Verify the dropdown has Option 2 text.
        List<WebElement> options = select.getOptions();

        List<String> optionsList = new ArrayList<>();

        for (WebElement option: options){
            optionsList.add(option.getText());
        }
        Assert.assertTrue(optionsList.contains("Option 2"));

        //Print first selected option.
        System.out.println(select.getFirstSelectedOption().getText());

        //Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
        int size = options.size();
        System.out.println(size);
        int ExpectedSize = 2;
        Assert.assertNotEquals(ExpectedSize,size);
        System.out.println("Expected Is Not Equal Actual");

        //if(size != 3){
            //System.out.println("Expected Is Not Equal Actual");
        //}

        //int ExpectedSize = 3;
        //Assert.assertEquals(ExpectedSize,size);
        //System.out.println("Expected Is Not Equal Actual");

    }

}
