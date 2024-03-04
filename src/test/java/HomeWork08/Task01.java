package HomeWork08;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Task01 extends TestBase {
    String url = "http://demo.guru99.com/test/drag_drop.html";
    @Test
    public void test(){
       // Go to URL: http://demo.guru99.com/test/drag_drop.html
        driver.get(url);

        //buttons locators
        By bankButtonXid = By.id("credit2");
        By salesButtonXid = By.id("credit1");
        By Button5000id = By.xpath("//li[@id='fourth'][1]");
        By Button2_5000id = By.xpath("//li[@id='fourth'][2]");


        //side locators
        By DEBITAccountsidel = By.className("placeholder");
        By CREDITAccountsidel = By.id("loan");
        By DEBITAmountsidel = By.id("amt7");
        By CREDITAmountsidel = By.id("amt8");


        //buttons
        WebElement bankButton = driver.findElement(bankButtonXid);
        WebElement salesButtonXi = driver.findElement(salesButtonXid);
        WebElement Button5000 = driver.findElement(Button5000id);
        WebElement Button2_5000 = driver.findElement(Button2_5000id);


        //side
        WebElement DEBITAccountside = driver.findElement(DEBITAccountsidel);
        WebElement CREDITAccountside = driver.findElement(CREDITAccountsidel);
        WebElement CREDIAmountside = driver.findElement(DEBITAmountsidel);
        WebElement CREDITAmounttside = driver.findElement(CREDITAmountsidel);



        //Drag and drop the BANK button to the Account section in DEBIT SIDE
        actions.dragAndDrop(bankButton,DEBITAccountside).perform();

        //Drag and drop the SALES button to the Account section in CREDIT SIDE
        actions.dragAndDrop(salesButtonXi,CREDITAccountside).perform();

        //Drag and drop the 5000 button to the Amount section in DEBIT SIDE
        actions.dragAndDrop(Button5000,CREDIAmountside).perform();

        //Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
        actions.dragAndDrop(Button2_5000,CREDITAmounttside).perform();



    }
}
