package HW;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class TC_04 {
    public static void main(String[] args) {

        // Go to the w3school URL :https://www.w3schools.com/
        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        driver.get("https://www.w3schools.com/");
        // Print the position and size of the page.
        System.out.println("the default position is "+driver.manage().window().getPosition());
        System.out.println("the default size is" + driver.manage().window().getSize());
        // Adjust the position and size of the page as desired.
        driver.manage().window().setPosition(new Point(500,500));
        driver.manage().window().setSize(new Dimension(1000,600));
        // Test that the page is in the position and size you want.
        System.out.println("the current position is "+driver.manage().window().getPosition());
        System.out.println("the current size is" + driver.manage().window().getSize());
        // Close the page.
        driver.quit();





    }
}
