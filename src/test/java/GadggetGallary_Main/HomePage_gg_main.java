package GadggetGallary_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_gg_main {

   public WebDriver driver;

    public HomePage_gg_main(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//img[@class='img-header-logo'])[1]")
    public WebElement Title;

    @FindBy(xpath = "//input[@class='form-control search-field product-search-field tt-input']")
    public WebElement verify_search_value;

    @FindBy(xpath = "(//button[@class='btn btn-secondary'])[1]")
    public WebElement click_on_searchbtn;

    @FindBy(xpath = "//div[@class='hfeed site']")
    public WebElement verifyPage;

    @FindBy(xpath = "//a[@class='woocommerce-product-gallery__trigger']")
    public WebElement Zoom_product_image;

    @FindBy(xpath = "//button[@class='pswp__button pswp__button--fs']")
    public WebElement Click_fs_button;

    @FindBy(xpath = "//button[@class='pswp__button pswp__button--close']")
    public WebElement Ckickclosebtn;

    @FindBy(xpath = "//input[@class='input-text qty text']")
    public WebElement addQuntity;

    @FindBy(xpath="//button[@class='single_add_to_cart_button button alt']")
    public WebElement add_to_cart;

    @FindBy(xpath = "//i[@class='ec ec-shopping-bag']")
    public WebElement cart_btn;

    @FindBy(xpath = "//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']")
    public  WebElement verify_add_to_cart_image;

    @FindBy(xpath = "//a[@class='button wc-forward']")
    public WebElement viewcaet;

    @FindBy(xpath = "//td[@class='product-name']")
    public WebElement verify_productname;

    @FindBy(xpath = "//tr[@class='woocommerce-cart-form__cart-item cart_item']//td[@class='product-price']")
    public WebElement verify_price;

    @FindBy(xpath = "//tr[@class='woocommerce-cart-form__cart-item cart_item']//td[@class='product-subtotal']")
    public WebElement verify_subTotalPrice;

    @FindBy(xpath = "//tr[@class='woocommerce-cart-form__cart-item cart_item']//input[@class='input-text qty text']")
    public WebElement verify_productQuantity;

    @FindBy(xpath = "//li[@class='yamm-fw menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-has-children menu-item-5306 dropdown']")
    public WebElement click_on_television;

    @FindBy(linkText = "Smart TVs")
    public WebElement over_on_smartTvs;

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[2]")
    public WebElement click_sec_pro;




}
