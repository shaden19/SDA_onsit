package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class TC_03 {
    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    // Expected Title
      String Expected_Title = "Google";
    // Set Path of the Chrome driver
        driver.get("https://google.com");
    // Launch Chrome browser
        System.out.println("Launch Safari browser");
    // Open URL of Website
        System.out.println("Open URL of Website");
    // Maximize Window
        driver.manage().window().maximize();
        System.out.println("the page is maximized ");
    // Get Title of current Page
       String current_Title = driver.getTitle();
       System.out.println("current Title is "+ current_Title);
    // Validate/Compare Page Title

        if(current_Title.contains(Expected_Title) ){
            System.out.println("the current equal's the expected Title ");
        }else
            System.out.println("the current dose not equal the expected Title");

    // Close Browser
        driver.quit();

    }
}
