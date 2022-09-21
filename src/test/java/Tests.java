import hooks.WebHooks;
import org.junit.jupiter.api.Test;

import static PageSteps.AutorizeSteps.autorize;
import static PageSteps.AutorizeSteps.openUrl;
import static PageSteps.MainPageSteps.openProject;
import static PageSteps.ProjectPageSteps.getTasksCount;
import static PageSteps.ProjectPageSteps.testSeleniumBug;
import static utils.Configuration.getConfigurationValue;

public class Tests extends WebHooks {

    @Test
    public void Test(){
        openUrl(getConfigurationValue("eduUrl"));
        autorize();
        openProject();
        getTasksCount();
        testSeleniumBug();
    }
}
