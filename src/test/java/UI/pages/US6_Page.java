package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US6_Page extends US1_Page {
    public US6_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//a[text()=' Contact us']")
    public WebElement contactUsButton;

    @FindBy(xpath ="//h2[text()='Get In Touch']")
    public WebElement getInTouchText;

    @FindBy(xpath = "//input[@data-qa='name']")
    public WebElement nameInputContactUsPage;

    @FindBy(xpath = "//input[@data-qa='email']")
    public WebElement emailInputContactUsPage;

    @FindBy(xpath = "//input[@data-qa='subject']")
    public WebElement subjectInputContactUsPage;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement messageInputContactUsPage;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadButtonContactUsPage;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButtonContactUsPage;

}
