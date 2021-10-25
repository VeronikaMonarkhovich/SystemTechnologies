package by.st.tests.company.page;

import io.qameta.allure.Step;
import by.st.config.App;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CompanyPage {
    @Step("Открываем страницу входа")
    public void openMainPage() {
        open(App.config.webUrl());
        if(!$(".top_menu_item.current").getText().equals("Рус")){
            $(byText("Рус")).click();
        }
    }

    @Step("Нажимаем на Компания")
    public void clickCompany() {
        $(byText("Компания")).click();
    }
}

