package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US17_Page extends Home_Page{
    public US17_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[text()='Add to cart'])[8]")
    public WebElement addProductEighth;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//li[text()='Shopping Cart']")
    public WebElement shoppingCartText;

    @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
    public WebElement firstXButton;
}
