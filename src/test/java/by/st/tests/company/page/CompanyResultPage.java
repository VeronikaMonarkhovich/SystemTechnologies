package by.st.tests.company.page;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CompanyResultPage {
    @Step("Проверяем информацию о компании")
    public void checkCompany() {
        $(".header").shouldHave(text("О компании"));
    }
}
