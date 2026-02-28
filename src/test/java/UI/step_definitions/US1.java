package UI.step_definitions;

import UI.pages.RegistrationPage;
import UI.utilities.ConfigurationReader;
import UI.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class US1 {

    RegistrationPage homePage=new RegistrationPage();


    @Given("User is on the Home page")
    public void user_is_on_the_home_page() {

        String expectedlUrl= ConfigurationReader.getProperty("url");
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedlUrl,actualUrl);

    }
    @Then("User should see home page is visible and clickable")
    public void user_should_see_home_page_is_visible_and_clickable() {

    Assert.assertTrue( homePage.homePageButton.isEnabled());
     Assert.assertTrue(homePage.brands.isDisplayed());
     Assert.assertTrue(homePage.category.isDisplayed());
     Assert.assertTrue(homePage.featuresItems.isDisplayed());

    }
    @Given("User click Click and SignUp button")
    public void user_click_click_and_sign_up_button() {
    Assert.assertTrue(homePage.signUpLoginButton.isEnabled());
    homePage.signUpLoginButton.click();
    }

    @Then("User should see registration page is visible")
    public void user_should_see_registration_page_is_visible() {
        Assert.assertTrue(homePage.NewUserSignUp.isDisplayed());
        Assert.assertTrue(homePage.LoginToYourAccount.isDisplayed());
    }
    @When("User enters userName,gmail adress information")
    public void user_enters_user_name_gmail_adress_information() {
        Faker name=new Faker();
        Faker gmail=new Faker();


        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       homePage.Name.sendKeys(name.name().firstName());

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.EmailAddress.sendKeys(gmail.internet().emailAddress());
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("User click SignUp button")
    public void user_click_sign_up_button() {
     homePage.SignUp.click();
     Assert.assertTrue(homePage.EnterAccountInformationText.isDisplayed());
    }
    @Given("User enters valid information to create account")
    public void user_enters_valid_information_to_create_account() {
        Faker password=new Faker();

        homePage.TitleRadioButtonMr.click();
        homePage.PasswordInput.sendKeys(password.internet().password());

        Select days=new Select(homePage.DayDropDown);
        Select months=new Select(homePage.MonthDropDown);
        Select years=new Select(homePage.YearDropDown);
        days.selectByValue("9");
        months.selectByVisibleText("September");
        years.selectByValue("1998");

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.SignUpForOurNewsletterCheckBox.click();
        homePage.ReceiveSpecialOffersFromOurPartnersCheckBox.click();
        Assert.assertTrue(homePage.addressInformationText.isDisplayed());
Faker firstName=new Faker();
homePage.FirstNameInput.sendKeys(firstName.name().firstName());
Faker lastName=new Faker();
homePage.LastNameInput.sendKeys(lastName.name().lastName());
Faker companyName=new Faker();
homePage.CompanyNameInput.sendKeys(companyName.company().name());
Faker address=new Faker();
homePage.AddressInput.sendKeys(address.address().fullAddress());
Select countryDropDown=new Select(homePage.CountryDropDown);
countryDropDown.selectByValue("United States");
homePage.StateInput.sendKeys("Florida");
homePage.CityInput.sendKeys("Tampa");
homePage.ZipCodeInput.sendKeys("33592");
Faker phoneNumber=new Faker();
homePage.PhoneNumberInput.sendKeys(phoneNumber.phoneNumber().phoneNumber());

homePage.CreateAccountButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(homePage.accountCreatedText.isDisplayed());



    }





}
