package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US7_Page extends US1_Page{
    public US7_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//a[text()=' Test Cases']")
    public WebElement testCasesButton;

    @FindBy(xpath ="//b[text()='Test Cases']")
    public WebElement testCasesText;

    @FindBy(xpath ="//span[text()='Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:']")
    public WebElement longText;
}
