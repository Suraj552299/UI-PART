package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US18_Page extends Home_Page{
    public US18_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='#Men']")
    public WebElement menText;

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenText;

    @FindBy(xpath = "//a[@href='#Kids']")
    public WebElement kidsText;
}
