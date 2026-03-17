package UI.pages.registiration;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US4_Page extends US3_Page {
    public US4_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[text()=' Logout']")
    public WebElement logOutButton;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement loggedInButton;
}
