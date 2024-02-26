package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OldVersion {

    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.driver","resource/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}