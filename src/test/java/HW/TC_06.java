package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class TC_06 {
    public static void main(String[] args) {
// Invoke FireFox Driver -> I do not have FireFox so I will use safari
        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
// Go to https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");
// Maximize the window
        driver.manage().window().maximize();
// Verify the page title contains the word video.
       String Expected_Title = "video";
       String original_Title = driver.getTitle();
        if(original_Title.contains(Expected_Title) ){
            System.out.println("the original Title contains the expected Title ");
        }else
            System.out.println("the original Title dose not contains the expected Title");
// Minimize the window
        driver.manage().window().minimize();
// Verify the page title contains the word video.
        String expected_title = "video";
        String original_title = driver.getTitle();
        if(original_title.contains(expected_title) ){
            System.out.println("the original Title contains the expected Title ");
        }else
            System.out.println("the original Title dose not contains the expected Title");
// Make the page fullscreen
        driver.manage().window().fullscreen();
// Close the driver
        driver.quit();
    }
}
