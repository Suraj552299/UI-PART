package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Home_Page {
    public Home_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//a[text()=' Home']")
    public WebElement homePageButton;

    @FindBy(xpath ="//a[text()=' Products']")
    public WebElement homePageProductsButton;

    @FindBy(xpath ="//a[text()=' Cart']")
    public WebElement homePageCartButton;

    @FindBy(xpath ="//a[text()=' Signup / Login']")
    public WebElement homePageSignUpAndLoginButton;

    @FindBy(xpath ="//a[text()=' Test Cases']")
    public WebElement homePageTestCasesButton;

    @FindBy(xpath ="//a[text()=' API Testing']")
    public WebElement homePageApiTestingButton;

    @FindBy(xpath ="//a[text()=' Video Tutorials']")
    public WebElement homePageVideoTutorialsButton;

    @FindBy(xpath =" //a[text()=' Contact us']")
    public WebElement homePageContactUsButton;


}
