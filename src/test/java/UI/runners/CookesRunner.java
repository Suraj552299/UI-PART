package UI.runners;

import io.cucumber.core.options.CucumberOptionsAnnotationParser;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "html:target/cucumber-reports.html",
        "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"
},
features ="src/test/resources/features",
        glue = "src/test/java/UI/step_definitions",
        dryRun = false,
        tags = "",
publish = true
)

public class CookesRunner {

}
