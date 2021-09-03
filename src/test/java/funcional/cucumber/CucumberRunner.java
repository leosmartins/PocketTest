package funcional.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/funcional/cucumber/features",
        glue = "src/test/java/funcional/cucumber/steps",
        plugin = {"pretty", "json:target/"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
