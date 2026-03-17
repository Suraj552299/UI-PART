package UI.step_definitions.scroll_step_definitions;

import UI.utilities.Wait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US26_Step_Definitions {

    @Given("User  scrolls down page to bottom")
    public void user_scrolls_down_page_to_bottom() {
    }

    @Given("User verifies  {string} is visible")
    public void user_verifies_is_visible(String string) {
    }

    @Given("User scrolls up page to top")
    public void user_scrolls_up_page_to_top() {
    }

    @Then("User verifies  that page is scrolled up and {string} text is visible on screen")
    public void user_verifies_that_page_is_scrolled_up_and_text_is_visible_on_screen(String string) {
        Wait.waitMethod(2);
    }

}
