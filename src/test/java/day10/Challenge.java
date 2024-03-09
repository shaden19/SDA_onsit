package Challenges;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Challenge extends TestBase {
    @Test
    public void test() {
        driver.get("https://www.youtube.com/");

        WebElement inputFild =driver.findElement(By.xpath("//input[@id='search']"));
        inputFild.sendKeys("interstellar");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']//div")).click();

        WebElement firstVideo = driver.findElement(By.cssSelector("a#video-title"));
        firstVideo.click();

    }
}