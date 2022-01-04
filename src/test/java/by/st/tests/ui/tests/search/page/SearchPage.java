package by.st.tests.ui.tests.search.page;

import io.qameta.allure.Step;
import by.st.tests.ui.config.App;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {

    @Step("Открываем страницу входа")
    public void openMainPage() {
        open(App.config.webUrl());
        if(!$(".top_menu_item.current").getText().equals("Рус")){
            $(byText("Рус")).click();
        }
    }

    @Step("Ввод в поисковую строку ")
    public void setSearch(String searchQuery) {
        $(".search.box").find("input").setValue(searchQuery).pressEnter();
    }
}