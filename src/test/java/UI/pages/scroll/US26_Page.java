package UI.pages.scroll;

import UI.pages.Home_Page;
import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US26_Page extends Home_Page {
    public US26_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscriptionText;

    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement subscribeButton;
}
