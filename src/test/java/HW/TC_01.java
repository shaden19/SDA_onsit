package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.sql.DriverManager;
import java.time.Duration;

public class TC_01 {
    public static void main(String[] args) {

    // Invoke Chrome Browser
        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    // Navigate to URL: https://www.w3schools.com/
        driver.navigate().to("https://www.w3schools.com/");
    // Navigate to URL: https://stackoverflow.com/
        driver.get("https://stackoverflow.com/");

    // Come back to the w3schools using the back command.
        driver.navigate().back();
        System.out.println("We came back to the previous page"+ driver.getCurrentUrl());
    // Again go back to the stackoverflow website using forward command
        driver.navigate().forward();
        System.out.println("We returned to "+ driver.getCurrentUrl());
    // Refresh the Browser using refresh command.
        driver.navigate().refresh();
        System.out.println("refresh is done");
    // Close the Browser.
        driver.quit();
    }
}
