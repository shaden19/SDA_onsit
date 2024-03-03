package HomeWork07;

import org.junit.Assert;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class Challenge extends TestBase {

    @Test
    public void test() {
        driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");

        // Switch to the first frame
        driver.switchTo().frame(0);

        // Click the button
        WebElement submitButton = driver.findElement(By.xpath("//li[@id='formAccess']//button[@value='submit']"));
        submitButton.click();

        // Send the name and lastname
        String name = "Reema";
        String lastname = "Alebbie";

        WebElement firstNameInput = driver.findElement(By.xpath("//li[@id='Name-li']//span[1]//input[1]"));
        WebElement lastNameInput = driver.findElement(By.xpath("//li[@id='Name-li']//span[2]//input[1]"));
        firstNameInput.sendKeys(name);
        lastNameInput.sendKeys(lastname);

        // Select the radio button
        WebElement radioButton = driver.findElement(By.xpath("//label[@for='Radio_1']"));
        radioButton.click();

        WebElement element = driver.findElement(By.id("Dropdown-arialabel"));

        // Create select object
        Select select = new Select(element); // To use select methods tag name must be "select"

        // use select methods to select option
        select.selectByIndex(1);

        WebElement disabelBox = driver.findElement(By.name("SingleLine"));
        Assert.assertFalse("Disabled box is enabled", disabelBox.isEnabled());

        List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='Checkbox-li']"));

        if (!checkboxes.get(0).isSelected()) {
            checkboxes.get(0).click();
        }

        // Click on the rating
        WebElement rating = driver.findElement(By.name("Rating"));
        rating.click();

    }
}