package by.st.tests.ui.tests.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MenuButtonResultPages {
    @Step("Проверяем заголовок")
    public void checkHeader(String header) {
        $(".header").shouldHave(text(header));
    }
}
