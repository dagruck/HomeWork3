package PageSteps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static PageObject.PageElements.ProjectPage.*;
import static com.codeborne.selenide.Selenide.sleep;

public class ProjectPageSteps {
    @Step("Выполняем задания")
    public static void getTasksCount() {
        //pageTasks.click();
        SelenideElement selenideElement = pagesCountElem.shouldBe(Condition.visible);
        String count = pagesCountElem.getOwnText();
        System.out.println("Here we have " + count.split(" ")[2] + " tasks.");
        //Разобраться с кодировкой
    }

    public static void testSeleniumBug() {
        allTasksAndFilters.shouldBe(Condition.visible).click();
        //sleep(2000);
        inputNameTask.shouldBe(Condition.visible).sendKeys("TestSelenium_bug");
        //sleep(2000);
        searchButton.click();
       // sleep(2000);
        assertStatus.shouldHave(Condition.text("Сделать"));
        //sleep(2000);
        assertVersion.shouldHave(Condition.text("Version 2.0"));
        //sleep(2000);
        createLink.click();
        //sleep(2000);
        typeTask.click();
        //sleep(2000);
        typeTask.sendKeys(Keys.DELETE);
        //sleep(2000);
        typeTask.shouldBe(Condition.visible).setValue("О");
        //sleep(2000);
        typeTask.pressEnter();
       // sleep(2000);
        themeTask.click();
        //sleep(2000);
        themeTask.sendKeys("Не меняется цена после смены валюты");
        //sleep(2000);
        descriptionTextButton.click();
        //sleep(2000);
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
        //sleep(2000);
        propertyTask.click();
        //sleep(2000);
        propertyTask.sendKeys(Keys.DELETE);
        //sleep(2000);
        propertyTask.shouldBe(Condition.visible).sendKeys("H");
        //sleep(2000);
        propertyTask.pressEnter();
        //sleep(2000);
        labelTask.click();
        //sleep(2000);
        labelTask.sendKeys("sonnov_test");
        //sleep(2000);
        labelTask.pressEnter();
        //sleep(2000);
        textEnvironment.sendKeys("Windows 10  Google chrome Версия 101.0.4951.67 (Официальная сборка), (64 бит) Сайт открыт по ссылке : * http://shop.findbug.ru/*");
        //sleep(2000);
        sunkVersion.click();
        sleep(2000);
        task.sendKeys("TEST-21967");
        //sleep(2000);
        task.pressEnter();
        sleep(2000);
        sprint.sendKeys("1");
        //sleep(2000);
        sprint.pressEnter();
        //sleep(2000);
        create.click();
        //sleep(2000);
        myTask.click();
        //sleep(2000);
        statusInWork.click();
        //sleep(2000);
        businessProcess.click();
        //sleep(2000);
        statusWin.click();
        //sleep(2000);
        getAssertStatusMyTask.shouldHave(Condition.text("Готово"));
        //sleep(5000);

    }
}
