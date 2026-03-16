package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US14_Page extends Home_Page{
    public US14_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    public WebElement addToCartButtonForFirstItem;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//u[text()='Register / Login']")
    public WebElement registerLoginButton;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement textArea;

    @FindBy(xpath = "//a[text()='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement payAndConfirmOrderButton;

    @FindBy(xpath = "//p[text()='Congratulations! Your order has been confirmed!']")
    public WebElement successMessageText;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton1;


}
