package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class TC_02 {
    public static void main(String[] args) {

    // Go to www.yahoo.com
        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://yahoo.com");
    // Maximize Window.
        driver.manage().window().maximize();
        System.out.println("the page is maximized ");
    // Go to www.amazon.com.
        driver.get("https://amazon.com");
    // Maximize Window.
        driver.manage().window().maximize();
        System.out.println("the page is maximized ");
    // Navigate Back.
        driver.navigate().back();
        System.out.println("We came back to the previous page"+ driver.getCurrentUrl());
    // Navigate Forward.
        driver.navigate().forward();
        System.out.println("We returned to "+ driver.getCurrentUrl());
    // Refresh The Page.
        driver.navigate().refresh();
        System.out.println("refresh is done");
    // quit the Browser.
        driver.quit();
    }
}
