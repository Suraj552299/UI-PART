package UI.pages.subscription;

import UI.pages.registiration.US1_Page;
import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US10_Page extends US1_Page {
    public US10_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//h2[text()='Subscription']")
    public WebElement subscriptionText;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement subscribeEmailInput;

    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement subscribeSubmitButton;
}
