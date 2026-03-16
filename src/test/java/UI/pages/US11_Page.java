package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_Page extends US1_Page{
    public US11_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()=' Cart']")
    public WebElement cartButtonOfHomePage;

    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscriptionButtonOfCartPage;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement emailInputOfCartPage;

    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement arrowButtonOfCartPage;

    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement arrowButtonOfCartPage1;

}
