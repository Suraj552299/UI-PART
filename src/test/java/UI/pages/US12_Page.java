package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12_Page extends US1_Page{
    public US12_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath ="//a[text()=' Products']")
    public WebElement productsButton;

    @FindBy(xpath ="(//a[text()='Add to cart'])[1]")
    public WebElement firstProductButton;

    @FindBy(xpath ="//button[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath ="(//a[text()='Add to cart'])[2]")
    public WebElement secondProductButton;

    @FindBy(xpath ="//u[text()='View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "(//td[@class='cart_quantity'])[1]")
    public WebElement FirstProductQuantity;

    @FindBy(xpath = "(//td[@class='cart_quantity'])[2]")
    public WebElement SecondProductQuantity;

    @FindBy(xpath = "(//td[@class='cart_total'])[1]")
    public WebElement FirstProductPrice;

    @FindBy(xpath = "(//td[@class='cart_total'])[2]")
    public WebElement SecondProductPrice;
}
