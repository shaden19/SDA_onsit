package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HW02 {
    public static void main(String[] args) {

        //Invoke Chrome Driver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navigate to Facebook homepage URL: https://www.facebook.com/
        driver.navigate().to("https://www.facebook.com/");

        //Verify expected URL equals to the actual URL.
        driver.get("https://www.facebook.com/");
        String expectedUrl = "https://www.facebook.com1/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }

        //Verify pagesource of FaceBook contains "Facebook" .

        String pageSource = driver.getPageSource();
        if (pageSource.contains("Facebook")) {
            System.out.println("Page source contains 'Facebook'");
        } else {
            System.out.println("Page source does not contain 'Facebook'");
        }


        //Close/Quit the browser
        driver.quit();

    }
}
