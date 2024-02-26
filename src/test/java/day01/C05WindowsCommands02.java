package day01;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05WindowsCommands02 {
   /*
   🡪 Go to the Amazon URL : https://www.amazon.com/
   🡪 Print the position and size of the page.
   🡪 Adjust the position and size of the page as desired.
   🡪 Test that the page is in the position and size you want.
   🡪 Close the page.
    */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 🡪 Go to the Amazon URL : https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // 🡪 Print the position and size of the page.
        System.out.println(driver.manage().window().getPosition().toString());
        System.out.println(driver.manage().window().getSize().toString());

        // 🡪 Adjust the position and size of the page as desired.
        Point newPosition = new Point(-1600,150); // We can prepare coordinate before
        Dimension newSize = new Dimension(1500,800);

        //هنا عرفنا فوق البوزشن والسايز عشان استدعيهم بالسيت وممكن اكتبها جوا السيت عادي بدون تعريف مثل الطريقة الي تحت ذا الكومنت

        driver.manage().window().setSize(newSize);
        Thread.sleep(1000);
        driver.manage().window().setSize(new Dimension(1000,500));
        Thread.sleep(1000);
        driver.manage().window().setPosition(newPosition);
        Thread.sleep(1000);
        driver.manage().window().setPosition(new Point(-800,300));// If we want we can write coordinate like this also
        // 🡪 Test that the page is in the position and size you want.

        // 🡪 Close the page.
        driver.quit();

    }
}