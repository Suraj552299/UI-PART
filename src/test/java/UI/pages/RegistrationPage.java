package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
public RegistrationPage(){
    PageFactory.initElements(Driver.getDriver(),this);

}
@FindBy(xpath = "//h2[text()='Features Items']")
public WebElement featuresItems;

@FindBy(xpath = "//h2[text()='Category']")
public WebElement category;

@FindBy(xpath = "//h2[text()='Brands']")
public WebElement brands;
@FindBy(xpath ="//a//i[@class='fa fa-home']")
public WebElement homePageButton;

@FindBy(xpath ="//a[text()=' Signup / Login']")
public WebElement signUpLoginButton;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement EnterAccountInformationText;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement TitleRadioButtonMr;

    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement TitleRadioButtonMrs;

    @FindBy(xpath = "//input[@data-qa='name']")
    public WebElement NameInput;

    @FindBy(xpath = "//input[@data-qa='email']")
    public WebElement EmailInput;

    @FindBy(xpath = "//input[@data-qa='password']")
    public WebElement PasswordInput;

    @FindBy(xpath = "//select[@data-qa='days']")
    public WebElement DayDropDown;

    @FindBy(xpath = "//select[@data-qa='months']")
    public WebElement MonthDropDown;

    @FindBy(xpath = "//select[@data-qa='years']")
    public WebElement YearDropDown;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement SignUpForOurNewsletterCheckBox;

   @FindBy(xpath = "//input[@id='optin']")
   public WebElement ReceiveSpecialOffersFromOurPartnersCheckBox;
   @FindBy(xpath = "//b[text()='Address Information']")
   public WebElement addressInformationText;

   @FindBy(xpath = "//input[@data-qa='first_name']")
    public WebElement FirstNameInput;

    @FindBy(xpath = "//input[@data-qa='last_name']")
    public WebElement LastNameInput;

    @FindBy(xpath = "//input[@data-qa='company']")
    public WebElement CompanyNameInput;

    @FindBy(xpath = "//input[@data-qa='address']")
    public WebElement AddressInput;

    @FindBy(xpath = "//select[@data-qa='country']")
    public WebElement CountryDropDown;

    @FindBy(xpath = "//input[@data-qa='state']")
    public WebElement StateInput;

    @FindBy(xpath = "//input[@data-qa='city']")
    public WebElement CityInput;

    @FindBy(xpath = "//input[@data-qa='zipcode']")
    public WebElement ZipCodeInput;

    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    public WebElement PhoneNumberInput;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement CreateAccountButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement NewUserSignUp;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement LoginToYourAccount;

    @FindBy(xpath = "//a[.//i[@class='fa fa-lock']]")
    public WebElement SignInAndSignUpButton;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement Name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")

    public WebElement EmailAddress;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement SignUp;

    @FindBy(xpath = "//b[text()='Account Created!']")
public WebElement accountCreatedText;







}
