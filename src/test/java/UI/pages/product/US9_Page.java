package UI.pages.product;

import UI.pages.registiration.US1_Page;
import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US9_Page extends US1_Page {
    public US9_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()=' Products']")
    public WebElement productsButton;

    @FindBy(xpath = "//h2[text()='All Products']")
    public WebElement allProductsText;


    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchInputBoxProductsPage;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchButtonProductsPage;
}
