package UI.pages.checkout;

import UI.pages.Home_Page;
import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US16_Page extends Home_Page {
    public US16_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//li[text()='Shopping Cart']")
    public WebElement shoppingCartText;


}
