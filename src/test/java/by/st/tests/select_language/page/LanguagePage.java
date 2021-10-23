package by.st.tests.select_language.page;

import by.st.config.App;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LanguagePage {
    @Step("Открываем страницу входа")
    public void openMainPage() {
        Selenide.open(App.config.webUrl());
    }

    @Step("Нажимаем на кнопку eng")
    public void clickEng() {

        $(byText("Eng")).click();
    }
}