package by.st.tests.ui.tests.search.page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {
    @Step("Проверка результатов поиска ")
    public void checkResults(String searchQuery) {
         ElementsCollection results = $$(".search_el");

            results.shouldBe(CollectionCondition.sizeGreaterThan(0))
                    .get(1)
                    .shouldHave(text(searchQuery));
        }
    }