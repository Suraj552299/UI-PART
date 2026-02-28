package UI.pages;

import UI.utilities.ConfigurationReader;
import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationPage extends RegistrationPage{
    public VerificationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//b[contains(text(),'Logged in as')]")
    public WebElement loggedInAsText;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    public WebElement getDeleteAccountButtonText;


}
