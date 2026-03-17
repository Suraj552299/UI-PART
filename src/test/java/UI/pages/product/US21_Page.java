package UI.pages.product;

import UI.pages.Home_Page;
import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US21_Page extends Home_Page {
    public US21_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[text()='All Products']")
    public WebElement allProductsText;

    @FindBy(xpath = "(//a[text()='View Product'])[1]")
    public WebElement firstViewProductButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameInputOfFirstView;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInputOfFirstView;

    @FindBy(xpath = "//textarea[@id='review']")
    public WebElement textInputOfFirstView;

    @FindBy(xpath = "//button[@id='button-review']")
    public WebElement buttonOfFirstView;

}
