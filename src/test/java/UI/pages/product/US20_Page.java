package UI.pages.product;

import UI.pages.Home_Page;
import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US20_Page extends Home_Page {
    public US20_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "//h2[text()='All Products']")
    public WebElement allProductsText;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchBoxOfProductsPage;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement submitButtonOfProductsPage;

    @FindBy(xpath = "//h2[text()='Searched Products']")
    public WebElement searchedProductOfText;

    @FindBy(xpath = "//a[text()='Add to cart']")
    public WebElement addToCartProduct;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//a[@class='cart_quantity_delete']")
    public WebElement deleteButton;



}
