package UI.step_definitions;

import UI.pages.US3_Page;
import UI.utilities.ConfigurationReader;
import UI.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.Duration;

public class US3_Step_Definitions {
    US3_Page errorMessagePage =new US3_Page();
    @Given("User Verifies {string} is visible")
    public void user_verifies_is_visible(String string) {
        Assert.assertTrue(errorMessagePage.LoginToYourAccount.isDisplayed());

    }
    @When("User enters incorrect email address and password")
    public void user_enters_incorrect_email_address_and_password() {
        errorMessagePage.loginEmail.sendKeys(ConfigurationReader.getProperty("gmail"));
        errorMessagePage.loginPassword.sendKeys(ConfigurationReader.getProperty("Password"));

    }
    @When("User  clicks {string} button")
    public void user_clicks_button(String string) {
        errorMessagePage.loginButton.click();

    }
    @Then("User verifies error {string} is visible")
    public void user_verifies_error_is_visible(String string) {
Assert.assertTrue(errorMessagePage.errorMessageText.isDisplayed());
    }
    @Given("User enters wrong email and right password")
    public void user_enters_wrong_email_and_right_password() {
        errorMessagePage.loginEmail.sendKeys(ConfigurationReader.getProperty("gmail"));
        errorMessagePage.loginPassword.sendKeys(ConfigurationReader.getProperty("Password"));
        errorMessagePage.loginButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(errorMessagePage.errorMessageText.isDisplayed());
    }
    @Given("User enters right email and wrong password")
    public void user_enters_right_email_and_wrong_password() {
        errorMessagePage.loginEmail.sendKeys(ConfigurationReader.getProperty("gmail"));
        errorMessagePage.loginPassword.sendKeys(ConfigurationReader.getProperty("Password"));
        errorMessagePage.loginButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(errorMessagePage.errorMessageText.isDisplayed());
    }






    }
