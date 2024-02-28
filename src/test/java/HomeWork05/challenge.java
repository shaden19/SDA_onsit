package HomeWork05;

import com.github.javafaker.Faker;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class challenge {
    static WebDriver driver;
    Faker faker = new Faker();
    String fulname1= faker.name().fullName();
    String fulname2= faker.name().fullName();

    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com");
    }
    @AfterClass
    public static void tearDown (){
        //driver.quit();
    }

    @Test
    public void test(){

        //Launch Browser
        WebElement emailRel = driver.findElement(By.xpath("//input[@id='email']"));
        emailRel.sendKeys("rzan@gmail.com");
        WebElement passRel = driver.findElement(By.xpath("//input[@id='password']"));
        passRel.sendKeys("1234567");
        WebElement buttonRel = driver.findElement(By.xpath("//button[@id='submit']"));
        buttonRel.click();
        //Navigate to the contact list page
        WebElement clikAdd = driver.findElement(By.id("add-contact"));
        clikAdd.click();


        // driver.navigate().to("");
        //Click on Add a New contact button
        emailRel = driver.findElement(By.xpath("//input[@id='email']"));
        emailRel.sendKeys(faker.internet().emailAddress());

        passRel = driver.findElement(By.id("firstName"));
        passRel.sendKeys(faker.name().firstName());

        passRel = driver.findElement(By.id("lastName"));
        passRel.sendKeys(faker.name().lastName());

        passRel = driver.findElement(By.id("birthdate"));
        passRel.sendKeys("2022-12-11");;

        passRel = driver.findElement(By.id("phone"));
        passRel.sendKeys("055055495");

        passRel = driver.findElement(By.id("street1"));
        passRel.sendKeys(faker.address().streetAddress());

        passRel = driver.findElement(By.id("street2"));
        passRel.sendKeys(faker.address().streetAddress());


        passRel = driver.findElement(By.id("stateProvince"));
        passRel.sendKeys(faker.address().state());


        passRel = driver.findElement(By.id("postalCode"));
        passRel.sendKeys(faker.address().zipCode());


        passRel = driver.findElement(By.id("country"));
        passRel.sendKeys(faker.country().name());

        passRel = driver.findElement(By.id("city"));
        passRel.sendKeys(faker.address().city());


        //buttonRel = driver.findElement(By.id("lastName"));
        //buttonRel.click();


        //Fill the fields

        //Click on submit button
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();



    }

}