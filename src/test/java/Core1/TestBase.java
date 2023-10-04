package Core1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {

    public WebDriver driver;

    @BeforeTest
    public void welcome(){
        System.out.println("Wel-come to the gadgetsgallery e-commerce site");
    }

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.gadgetsgallery.in/");

    }
    @AfterMethod
    public void tearDown(){

        driver.close();
    }
    @AfterTest
    public void thankyou(){
        System.out.println("Thank you");
    }
}


