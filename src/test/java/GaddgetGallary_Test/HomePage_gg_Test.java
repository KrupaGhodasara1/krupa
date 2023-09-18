package GaddgetGallary_Test;

import Core1.TestBase;
import GadggetGallary_Main.HomePage_gg_main;
import OrangeHRM.main.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage_gg_Test extends TestBase {
    HomePage_gg_main home;

    @Test
    public void clickOperation() throws InterruptedException {
        home = new HomePage_gg_main(driver);
       // home.Title.isEnabled();
        String actual_title = driver.getTitle();
        Assert.assertEquals(actual_title, "Gadgets Gallery Online Shopping Site For Mobiles, Electronics, IT, Personal Care & More. - Gadgets Gallery");
        //System.out.println(driver.getTitle());

        home.verify_search_value.sendKeys("Apple");

        home.click_on_searchbtn.click();

        String actual_pageVerify = driver.getTitle();
        Assert.assertEquals(actual_pageVerify, "Mobile Plug ACP-12 Lightning USB Cable (White) - Gadgets Gallery");


        home.Zoom_product_image.click();

        home.Click_fs_button.click();

        home.Ckickclosebtn.click();

        home.addQuntity.clear();

        home.addQuntity.sendKeys("2");

        home.add_to_cart.click();

        home.cart_btn.click();

        home.viewcaet.click();

        Assert.assertEquals(home.verify_productname.getText(),"Mobile Plug ACP-12 Lightning USB Cable (White)");
      //  System.out.println(home.verify_productname.getText());

        Thread.sleep(9000);


    }
}
