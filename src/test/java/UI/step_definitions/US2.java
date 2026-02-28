package UI.step_definitions;

import UI.pages.VerificationPage;
import UI.utilities.ConfigurationReader;
import UI.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.time.Duration;

public class US2 extends Common {
    VerificationPage verificationPage=new VerificationPage();


    @Given("User should see {string} is visible")
    public void user_should_see_is_visible(String string) {
        Assert.assertTrue( homePage.LoginToYourAccount.isDisplayed());
    }
    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        verificationPage.loginEmail.sendKeys(ConfigurationReader.getProperty("gmail"));
        verificationPage.loginPassword.sendKeys(ConfigurationReader.getProperty("Password"));


    }
    @Then("Click {string} button")
    public void click_button(String string) {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        verificationPage.loginButton.submit();
    }
    @Then("User Verifies that {string} is visible")
    public void user_verifies_that_is_visible(String string) {
        Assert.assertTrue(verificationPage.deleteAccountButton.isDisplayed());
        Assert.assertTrue(verificationPage.loggedInAsText.isDisplayed());
    }

    @Then("User clicks {string} button")
    public void user_clicks_button(String string) {

    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {

        Assert.assertTrue(verificationPage.getDeleteAccountButtonText.isDisplayed());
    }

}
