package by.st.tests.ui.tests.select_language.page;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LanguageResultPage {
    @Step("Проверка результата")
    public void checkResults() {
        $(".slide_content").shouldHave(text("Effective IT-solutions"));
    }
}