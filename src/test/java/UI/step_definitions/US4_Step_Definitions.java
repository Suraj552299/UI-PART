package UI.step_definitions;

import UI.pages.US4_Page;
import UI.utilities.ConfigurationReader;
import UI.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.time.Duration;

public class US4_Step_Definitions {
    String expectedUrl="https://automationexercise.com/login";
    US4_Page logOutPage=new US4_Page();
    @Given("User enters correct email address and password")
    public void user_enters_correct_email_address_and_password() {
        Assert.assertTrue(logOutPage.LoginToYourAccount.isDisplayed());
        logOutPage.loginEmail.sendKeys(ConfigurationReader.getProperty("gmail"));
        logOutPage.loginPassword.sendKeys(ConfigurationReader.getProperty("Password"));
        logOutPage.loginButton.click();
    }
    @Then("User verifies that {string} is visible")
    public void user_verifies_that_is_visible(String string) {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try {
            Assert.assertTrue(logOutPage.loggedInButton.getText().contains(ConfigurationReader.getProperty("Name")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    @Then("User verifies that user is navigated to login page")
    public void user_verifies_that_user_is_navigated_to_login_page() {
        logOutPage.logOutButton.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }
}
