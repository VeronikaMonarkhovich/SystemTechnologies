package by.st.tests.ui.tests.connect.page;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ConnectResultsPage {
    @Step("Проверяем окно 'Связаться с нами'")
    public void checkConnect() {
        $("#fancybox-content").shouldBe(visible);
        $("#comp_470737605f88e4802dc2afda0d27e594").shouldHave(text("Задать вопрос"));
    }
}
