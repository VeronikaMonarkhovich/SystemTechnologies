package by.st.tests.connect.page;

import by.st.config.App;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ConnectPage {
    @Step("Открываем страницу входа")
    public void openMainPage() {
        open(App.config.webUrl());
    }

    @Step("Нажимаем на 'Связаться с нами'")
    public void clickConnect() {
        $(byText("Связаться с нами")).click();
    }
}
