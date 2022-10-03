import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"Hooks", "PageSteps", "Hooks","PageElements"},
        tags = "@homeWorkCucumber"
)
public class CucumberTest {
}