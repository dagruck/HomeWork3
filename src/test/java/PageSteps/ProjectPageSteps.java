package PageSteps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

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
        inputNameTask.shouldBe(Condition.visible).sendKeys("TestSelenium_bug");
        searchButton.click();
        sleep(5000);

    }
}

//public static SelenideElement allTasksAndFilters = $x("//a[contains(text(),'Посмотреть все задачи и фильтры')]");
//    public static SelenideElement inputNameTask = $x("//input[@class='search-entry text medium-field ajs-dirty-warning-exempt']");