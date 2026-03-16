package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US3_Page extends US2_Page{
    public US3_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement errorMessageText;
}
