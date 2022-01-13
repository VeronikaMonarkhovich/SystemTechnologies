package by.st.tests.ui.tests.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    @Step("Нажимаем на кнопку меню")
    public void clickButton(String menuButton) {
        $(byText(menuButton)).click();
    }

    @Step("Нажимаем на кнопку 'Связаться с нами'")
    public void clickConnectWithUs() {
        $(byText("Связаться с нами")).click();
    }

    @Step("Ввод в поисковую строку ")
    public void setSearch(String searchQuery) {
        $(".search.box").find("input").setValue(searchQuery).pressEnter();
    }

    @Step("Нажимаем на кнопку выбора языка")
    public void clickLanguage(String language) {
        $(byText(language)).click();
    }

    @Step("Проверка языка")
    public void checkLanguage(String slideContent) {
        $(".slide_content").shouldHave(text(slideContent));
    }
}