package by.st.tests.check_address.page;

import by.st.config.App;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class AddressPage {
    @BeforeAll
    static void configureBaseUrl() {
        Configuration.baseUrl = App.config.webUrl();
    }

    @Step("Открываем страницу")
    public void openMainPage() {
        open(App.config.webUrl());
    }

    @Step("Проверяем адресс компании")
    public void checkAddress() {
        $(".address").find(".icon_box").shouldHave(text("ул. Академика Купревича, 3"));
    }
}