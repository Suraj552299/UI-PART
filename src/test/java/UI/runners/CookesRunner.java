package UI.runners;

import io.cucumber.core.options.CucumberOptionsAnnotationParser;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "html:target/cucumber-reports.html",
        "rerun:target/rerun.txt",

},
features ="src/test/resources/features",
        glue = "UI.step_definitions",
        dryRun = true,
        tags = "@US5",
publish = false
)

public class CookesRunner {

}
