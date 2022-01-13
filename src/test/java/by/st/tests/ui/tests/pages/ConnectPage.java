package by.st.tests.ui.tests.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ConnectPage {
    @Step("Проверяем окно 'Связаться с нами'")
    public void checkConnectWithUs() {
        $("#fancybox-content").shouldBe(visible);
        $("#common_feedback").shouldHave(text("Задать вопрос"));
    }
}
