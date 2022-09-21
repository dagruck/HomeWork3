package PageSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static PageObject.PageElements.AutorizePage.*;
import static PageObject.PageElements.MainPage.projectTestLink;
import static PageObject.PageElements.MainPage.projectsMenuButton;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static utils.Configuration.getConfigurationValue;

public class MainPageSteps {
    @Step("Переходим в проект Тест")
    public static void openProject(){
        projectsMenuButton.shouldBe(Condition.visible).click();
        projectTestLink.shouldBe(Condition.visible).click();
        //sleep(5000);
    }
// Переходим в проект Test
    //public static SelenideElement projectsMenuButton = $x("//a[@id='browse_link']");
    //    public static SelenideElement projectTestLink = $x("//a[contains(text(), 'Test (TEST)')]");


}
