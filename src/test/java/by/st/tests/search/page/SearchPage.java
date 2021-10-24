package by.st.tests.search.page;

import io.qameta.allure.Step;
import by.st.config.App;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {

    @Step("Открываем страницу входа")
    public void openMainPage() {
        open(App.config.webUrl());
    }

    @Step("Ввод в поисковую строку ")
    public void setSearch(String searchQuery) {
        $(".search.box").find("input").setValue(searchQuery).pressEnter();
    }
}