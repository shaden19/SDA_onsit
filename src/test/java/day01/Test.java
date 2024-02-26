package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {
        /*
         You might see the syntax of creating a driver object different forms :
                1)
                        -----   System.setProperty("WebDriver.Chrome.driver","resource/drivers/chromedriver"); --> first parameter name of the driver, second is its path
                                WebDriver driver = new ChromeDriver()

                                As time goes above syntax is simplified as below (2nd option)

                2)          We use Maven to simplify creation of driver object by using    "WebDriverManager"
                            WebDriverManager.ChromeDriver().setup;
                            WebDriver driver = new ChromeDriver()

                    BUT NOW we don't neeed to use any of them. By adding Selenium dependency of the latest release we can create driver
                    object directly...

          */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.get("https://clarusway.com");
    }

}