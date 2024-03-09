package HomeWork09;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class Task01 extends TestBase {
    @Test
    public void test() {
        // Go to URL : https://facebook.com
        driver.get("https://facebook.com");
        //getCookies,
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie: cookies){
            System.out.println(cookie);
        //addCookie
            Cookie newCookie = new Cookie("name","alaa");
            Cookie newCookie2 = new Cookie("name","noor");
            driver.manage().addCookie(newCookie);
            driver.manage().addCookie(newCookie2);
            driver.manage().getCookies().forEach(System.out::println);
        // delete named cookie
            driver.manage().deleteCookieNamed("alaa");
            driver.manage().getCookies().forEach(System.out::println);
        // delete all cookies
            driver.manage().deleteAllCookies();
            driver.manage().getCookies().forEach(System.out::println);
        }
    }


}
