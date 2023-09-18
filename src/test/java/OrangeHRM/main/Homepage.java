package OrangeHRM.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Homepage {
WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@name='action_request']") public WebElement try_for_free_link;

    //signup page
    @FindBy(xpath="//input[@id='Form_getForm_subdomain']") public static WebElement username;
    @FindBy(id = "Form_getForm_Name") public static WebElement FirstName;
    @FindBy(id = "Form_getForm_Email") public static WebElement Email;
    @FindBy(xpath="//input[@name='Contact']") public WebElement phone_no;
    @FindBy(xpath = "//select[@class='dropdown']") public WebElement City; // for droupdown

    @FindBy(xpath = "//div[@id='rc-anchor-container']//div[@class='recaptcha-checkbox-border']") public WebElement recapcha;
    @FindBy(id = "Form_getForm_action_submitForm") public WebElement get_your_free_trial;




}
