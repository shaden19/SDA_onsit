package HW;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TC_08 {
    // Go to google homepage
    static WebDriver driver;

    @BeforeClass
    public static void beforeClass(){
        driver = new SafariDriver();
        driver.get("https://google.com");
    }

    @AfterClass
    public  static void afterClass(){
        driver.quit();
    }

    //Print "Tests are starting to run" before each test() method
    @Before
    public void befor(){
        System.out.println("Tests are starting to run");
    }


    // Print "Tests have finished running" after each test() method
    @After
    public void after(){
        System.out.println("Tests have finished running");
    }



    //Test if the title is the same when the page window is maximize and minimize
    @Test
    public void test1(){
        driver.manage().window().maximize();
        String max = driver.getTitle();
        driver.manage().window().minimize();
        String min = driver.getTitle();
        Assert.assertEquals(max,min);
    }

    // Test if the title does not contain "Video" when the page window is fullscreen

    @Test
    public void test2(){
        driver.manage().window().fullscreen();
        boolean it_contain = driver.getTitle().contains("Video");
        Assert.assertFalse(it_contain); ;
    }

    @Test
    public void test3(){
        boolean isUrlContain = driver.getCurrentUrl().contains("google");
        Assert.assertTrue(isUrlContain);
    }


}

