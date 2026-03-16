package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US13_Page extends US1_Page{

    public US13_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[text()='View Product'])[5]")
    public WebElement fifthProduct;

    @FindBy(xpath = "//input[@id='quantity']")
    public WebElement inputQuantity;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement addCartButton;

    @FindBy(xpath = "//u[text()='View Cart']")
    public WebElement viewCartButton;

}
