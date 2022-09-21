package hooks;

import PageSteps.AutorizeSteps;
import PageSteps.MainPageSteps;
import PageSteps.ProjectPageSteps;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class WebHooks {
    @BeforeAll()
    public static void setDriverFromProps() {
    Configuration.startMaximized = true;
    String webDriverLocation = utils.Configuration.getConfigurationValue("webdriverlocationLOCAL");
    if (utils.Configuration.getConfigurationValue("remote.url") != null)
        Configuration.remote = utils.Configuration.getConfigurationValue("remote.url");
    if (webDriverLocation != null){
        System.setProperty("webdriver.chrome.driver", webDriverLocation);
        System.setProperty("selenide.browser", "Chrome");

    }
    }
    @Test
    public static void Test(){
        AutorizeSteps.openUrl("https://edujira.ifellow.ru/");
        AutorizeSteps.autorize();
        MainPageSteps.openProject();
        ProjectPageSteps.getTasksCount();
        ProjectPageSteps.testSeleniumBug();
    }

}
