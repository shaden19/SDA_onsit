package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hw {

    //Create main method
    public static void main(String[] args) throws InterruptedException {

        //Create chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Open google home page: https://www.google.com
        driver.get("https://www.google.com/");
        // Print Title on page
        String title = driver.getTitle();
        // Print the title
        System.out.println("Title of the page is: " + title);

        //Print Current URL on page
        String currentURL = driver.getCurrentUrl();
        //Print the URL
        System.out.println("Current URL of the page is: " + currentURL);
        //Close/Quit the browser
        driver.quit();
    }
}