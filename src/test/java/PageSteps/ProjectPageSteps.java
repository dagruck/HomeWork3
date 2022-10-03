package PageSteps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static PageObject.PageElements.ProjectPage.*;
import static com.codeborne.selenide.Selenide.sleep;

public class ProjectPageSteps {
    @Step("Выполняем задания")
    @Then("Вывести в консоль количество задач")
    public static void getTasksCount() {
        //pageTasks.click();
        SelenideElement selenideElement = pagesCountElem.shouldBe(Condition.visible);
        String count = pagesCountElem.getOwnText();
        System.out.println("Here we have " + count.split(" ")[2] + " tasks.");
        //Разобраться с кодировкой
    }

    public static void testSeleniumBug() {
        allTasksAndFilters.shouldBe(Condition.visible).click();
        inputNameTask.shouldBe(Condition.visible).sendKeys("TestSelenium_bug");
        searchButton.click();
        assertStatus.shouldHave(Condition.text("Сделать"));
        assertVersion.shouldHave(Condition.text("Version 2.0"));
        createLink.click();
        typeTask.click();
        typeTask.sendKeys(Keys.DELETE);
        typeTask.shouldBe(Condition.visible).setValue("О");
        typeTask.pressEnter();
        themeTask.click();
        themeTask.sendKeys("Не меняется цена после смены валюты");
        descriptionTextButton.click();
        textAreaDescription.sendKeys("Шаги \n" +
                "\n" +
                "1) открытие сайта\n" +
                "\n" +
                "Ожидаемый результат :\n" +
                "\n" +
                "Сайт открылся\n" +
                "\n" +
                "2) Смена валюты\n" +
                "\n" +
                "Ожидаемый результат \n" +
                "\n" +
                "Валюта изменилась, изменилась цена в соответствии с курсом заданному в настройках интернет-магазина \n" +
                "\n" +
                "Фактический результат:\n" +
                "\n" +
                "Иконки валют изменились\n" +
                "\n" +
                "Цена не изменилась");
        versionAreaDescription.click();
        propertyTask.click();
        propertyTask.sendKeys(Keys.DELETE);
        propertyTask.shouldBe(Condition.visible).sendKeys("H");
        propertyTask.pressEnter();
        labelTask.click();
        labelTask.sendKeys("sonnov_test");
        labelTask.pressEnter();
        textEnvironment.sendKeys("Windows 10  Google chrome Версия 101.0.4951.67 (Официальная сборка), (64 бит) Сайт открыт по ссылке : * http://shop.findbug.ru/*");
        sunkVersion.click();
        sleep(2000);
        task.sendKeys("TEST-21967");
        task.pressEnter();
        sleep(2000);
        sprint.sendKeys("1");
        sprint.pressEnter();
        create.click();
        myTask.click();
        statusInWork.click();
        sleep(1000);
        businessProcess.click();
        sleep(1000);
        statusWin.click();
        sleep(1000);
        getAssertStatusMyTask.shouldHave(Condition.text("Готово"));
        sleep(3000);

    }
}
