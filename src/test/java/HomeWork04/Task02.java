package HomeWork04;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Task02 {
    //Task 2:
    //        * breakout task: (in a separate class)
    //        * navigate to this url https://www.saucedemo.com/v1/inventory.html
    //        * add the first item you find to your cart
    // * open your cart*
    //        * assert that the item name is correct inside the cart
    // */
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        ChromeOptions options =new ChromeOptions();
        driver =new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }
    @Test
    public void test (){

        // Find and add the first item to the cart
        WebElement addItemButton = driver.findElement(By.xpath("//*[@class='btn_primary btn_inventory']"));
        addItemButton.click();

        // Open the cart
        WebElement cartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']"));
        cartIcon.click();

        // Assert that the item name is correct inside the cart
        WebElement itemNameInCart = driver.findElement(By.className("inventory_item_name"));
        String itemName = itemNameInCart.getText();
        Assert.assertEquals("Sauce Labs Backpack",itemName);
        // Replace "Name of the First Item" with the actual item name

        // Print a success message if the assertion passes
        System.out.println("Item name in cart is correct: " + itemName);

    }
}