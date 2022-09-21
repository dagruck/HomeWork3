package PageSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static PageObject.PageElements.ProjectPage.pageTasks;
import static PageObject.PageElements.ProjectPage.pagesCountElem;
public class ProjectPageSteps {
    @Step("Находим общее количество задач")
    public static void getTasksCount() {
        pageTasks.click();
      //pagesCountElem.shouldBe(Condition.visible);
        String count = pagesCountElem.getOwnText();
        System.out.println("Here we have " + count.split(" ")[2] + " tasks.");
        //Разобраться с кодировкой
    }
}
