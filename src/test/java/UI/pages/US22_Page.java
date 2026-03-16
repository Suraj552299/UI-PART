package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US22_Page extends Home_Page{
    public US22_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[text()='recommended items']")
    public WebElement recommendedItemsText;

    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    public WebElement firstItemUnderOfRecommended;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShoppingButtonOfFirstItem;

    @FindBy(xpath = "//a[text()='Blue Top']")
    public WebElement addedItemName;



}
