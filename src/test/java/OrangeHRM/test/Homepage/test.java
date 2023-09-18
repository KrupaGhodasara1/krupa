package OrangeHRM.test.Homepage;

import Core.TestBase;
import OrangeHRM.main.Homepage;
import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test extends TestBase {
    Homepage home;
    @Test
    public void clickOperation() throws InterruptedException {
      home = new Homepage(driver);
      home.try_for_free_link.click();

      home.username.sendKeys("Krupa");

     home.FirstName.sendKeys("kru");

     home.Email.sendKeys("Kru@gmail.com");

     home.phone_no.sendKeys("9876543267");

     Select selectobject = new Select(home.City); // for droup down
         selectobject.selectByValue("India");

     //home.recapcha.click();

     home.get_your_free_trial.click();
Thread.sleep(9000);
    }
}







