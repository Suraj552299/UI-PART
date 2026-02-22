package UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage {
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement NewUserSignUp;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement LoginToYourAccount;
}
