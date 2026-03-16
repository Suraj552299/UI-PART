package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US23_Page extends Home_Page{

    public US23_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    public WebElement firstItem;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//li[text()='Shopping Cart']")
    public WebElement shoppingCartText;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//ul[@id='address_delivery']")
    public WebElement yourDeliveryAddress;

    @FindBy(xpath = "//ul[@id='address_invoice']")
    public WebElement yourBillingAddress;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    public WebElement accountDeletedText;




}
