package UI.pages.product;

import UI.pages.registiration.US1_Page;
import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US8_Page extends US1_Page {
    public US8_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()=' Products']")
    public WebElement productsButton;

    @FindBy(xpath = "//h2[text()='All Products']")
    public WebElement allProductsText;

    @FindBy(xpath = "(//a[text()='View Product'])[1]")
    public WebElement firstViewProduct;

    @FindBy(xpath = "//div[@class='product-information']")
    public WebElement productInformation;

    @FindBy(xpath = "//h2[text()='Blue Top']")
    public WebElement productName;

    @FindBy(xpath = "//p[text()='Category: Women > Tops']")
    public WebElement category;

    @FindBy(xpath = "//span[text()='Rs. 500']")
    public WebElement price;

    @FindBy(xpath = "//p[text()=' In Stock']")
    public WebElement availability;

    @FindBy(xpath = "//p[text()=' New']")
    public WebElement condition;

    @FindBy(xpath = "//p[text()=' Polo']")
    public WebElement brand;
}
