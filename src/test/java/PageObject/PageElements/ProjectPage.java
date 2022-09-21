package PageObject.PageElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProjectPage {

    //public static SelenideElement pageTasks = $x("//a[@title='Поиск и просмотр недавних задач']");
    //public static SelenideElement pageFindTasks = $x("//a[@id='issues_new_search_link_lnk']");
    public static SelenideElement pagesCountElem = $x("//div[@class='showing']//span");
    public static SelenideElement allTasksAndFilters = $x("//a[contains(text(),'Посмотреть все задачи и фильтры')]");
    public static SelenideElement inputNameTask = $x("//input[@class='search-entry text medium-field ajs-dirty-warning-exempt']");
    public static SelenideElement searchButton = $x("//button[@class='aui-button aui-button-primary search-button']");



}
