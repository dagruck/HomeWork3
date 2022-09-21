package PageObject.PageElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProjectPage {

    public static SelenideElement pageTasks = $x(" //span[@title='Задачи']");
    public static SelenideElement pagesCountElem = $x("//div[@class='showing']//span");
}