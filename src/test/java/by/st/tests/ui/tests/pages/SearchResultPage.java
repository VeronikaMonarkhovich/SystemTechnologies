package by.st.tests.ui.tests.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {
    @Step("Проверка результатов поиска ")
    public void checkResults(String searchQuery) {
        $$(".search_el").get(1)
                    .shouldHave(text(searchQuery));
        }
    }