package UI.pages.product;

import UI.pages.Home_Page;
import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US19_Page extends Home_Page {
    public US19_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[text()='Brands']")
    public WebElement brandsText;

    @FindBy(xpath = "//a[text()='Polo']")
    public WebElement poloBrand;

    @FindBy(xpath = "//li[text()='Polo']")
    public WebElement poloText;

    @FindBy(xpath = "//li[text()='Madame']")
    public WebElement madameText;
}
