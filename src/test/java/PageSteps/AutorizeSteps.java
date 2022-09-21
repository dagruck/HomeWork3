package PageSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static PageObject.PageElements.AutorizePage.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static utils.Configuration.getConfigurationValue;

public class AutorizeSteps {
    @Step("Проведем авторизацию {eduUrl}")
    public static void openUrl(String eduUrl) {
        open(eduUrl);
    }
public static void autorize(){
    loginLane.shouldBe(Condition.visible).sendKeys(getConfigurationValue("login"));
    passwordLane.sendKeys(getConfigurationValue("password"));
    loginButton.click();
    welcome.shouldHave(Condition.text("Добро пожаловать в Jira"));
}


}
