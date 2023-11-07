package Core1;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestBase {

    public WebDriver driver;

    @BeforeTest
    public void welcome(){
        System.out.println("Wel-come to the gadgetsgallery e-commerce site");
    }

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) throws Exception {
        //Check if parameter passed from TestNG is 'firefox'

        if(browser.equalsIgnoreCase("edge")){
            //Launch edge driver
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://www.gadgetsgallery.in/");
        } else if (browser.equalsIgnoreCase("chrome")) {
            //Launch chrome driver
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://www.gadgetsgallery.in/");

        }else{
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


//parent child relationship, mouse hover, hightlight
    @AfterMethod
    public void tearDown(){

        driver.close();
    }
    @AfterTest
    public void thankyou(){

        System.out.println("Thank you");
    }
}



