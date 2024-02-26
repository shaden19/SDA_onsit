package HW;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TC_07 {

    // Go to YouTube homepage
    static WebDriver driver;

        @BeforeClass
        public static void beforeClass(){
            driver = new SafariDriver();
            driver.get("https://www.youtube.com/");
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



    // Test if the currentURL contains "youtube"
        @Test
        public void test01(){
            String expected_title = "youtube";
            String original_title = driver.getTitle();
            if(original_title.contains(expected_title) )
                System.out.println("the original Title contains youtube");
        }

    // Test if the title does not contain "Video".
    @Test
        public void test02(){
        boolean isTitle = driver.getTitle().contains("Video");
        Assert.assertFalse(isTitle);
    }

    // Test if the URL contains "youtube".

    @Test
    public void test03(){
        boolean isUrlContainsYoutube=driver.getCurrentUrl().contains("youtube");
        Assert.assertTrue(isUrlContainsYoutube);
    }

    // Test if the sourcePage contains "youtube".
    @Test
    public void test04(){
        Boolean isSourcePageContainsYoutube = driver.getPageSource().contains("youtube");
        Assert.assertTrue(isSourcePageContainsYoutube);
    }
    }



