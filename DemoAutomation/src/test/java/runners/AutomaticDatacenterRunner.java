package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/validateLocationDatacenter.feature",
        glue = "stepdefinition",
        tags = "",
        snippets = SnippetType.CAMELCASE
)


public class AutomaticDatacenterRunner {
}
