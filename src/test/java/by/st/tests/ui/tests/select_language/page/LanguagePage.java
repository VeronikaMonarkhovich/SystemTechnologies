package by.st.tests.ui.tests.select_language.page;

import by.st.tests.ui.config.App;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LanguagePage {
    @Step("Открываем страницу входа")
    public void openMainPage() {
        Selenide.open(App.config.webUrl());
        if(!$(".top_menu_item.current").getText().equals("Рус")){
            $(byText("Рус")).click();
        }
    }

    @Step("Нажимаем на кнопку eng")
    public void clickEng() {

        $(byText("Eng")).click();
    }
}