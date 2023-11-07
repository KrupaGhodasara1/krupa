package GaddgetGallary_Test;

import Core1.TestBase;
import GadggetGallary_Main.HomePage_gg_main;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HomePage_gg_Test extends TestBase {
    HomePage_gg_main home;

    public static Logger logger = LogManager.getLogManager().getLogger(String.valueOf(TestBase.class));

    @Test(priority = 1)
    public void clickOperation() throws InterruptedException {
        home = new HomePage_gg_main(driver);
        // home.Title.isEnabled();
        String actual_title = driver.getTitle();
      //  Assert.assertEquals(actual_title, "Gadgets Gallery Online Shopping Site For Mobiles, Electronics, IT, Personal Care & More. - Gadgets Gallery");
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

        Assert.assertEquals(home.verify_productname.getText(), "Mobile Plug ACP-12 Lightning USB Cable (White)");
        System.out.println(home.verify_productname.getText());

        Assert.assertEquals(home.verify_price.getText(),"₹23" + "9.00");
        System.out.println(home.verify_price.getText());

        Assert.assertEquals(home.verify_subTotalPrice.getText(),"₹478.00");
        System.out.println(home.verify_subTotalPrice.getText());

        /*Assert.assertEquals(home.verify_productQuantity.getText(),"2")
        System.out.println(home.verify_productQuantity.getText());*/

        home.click_on_television.click();

        Actions actions = new Actions(driver);
        actions.moveToElement(home.over_on_smartTvs).perform();

        Thread.sleep(9000);

    }
    @Test(priority = 2)
    public void addProduct() throws InterruptedException {

        System.out.println("Click on 2nd product image verify particular image detail page is open");
        home = new HomePage_gg_main(driver);
        home.click_sec_pro.click();

        //home.pro_name.getText();
        System.out.println(home.pro_name.getText());

        home.add_cart.click();

        home.cart_btn.click();

        home.viewcaet.click();

        String product_name= home.productname2.getText();
        Assert.assertEquals(product_name,"Philips Daily collection HL7566 500Watts Juicer (Deep Azure)");

        String actual_price = home.verify_price.getText();
        String expected_price = "₹2,899.00";
        Assert.assertEquals(actual_price,expected_price);
        System.out.println("actual price = "+actual_price);
        System.out.println("expected price ="+expected_price);


        home.cupponcode.sendKeys("abcd123");

        home.applybtn.click();

        Thread.sleep(6000);

        home.proceed_to_checkout.click();



    }
}
