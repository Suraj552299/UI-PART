package UI.utilities;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Wait {
    public static void waitMethod(int second){
        WebDriver.Timeouts timeouts=Driver.getDriver().manage().timeouts();
        timeouts.implicitlyWait(Duration.ofSeconds(second));
    }
}
