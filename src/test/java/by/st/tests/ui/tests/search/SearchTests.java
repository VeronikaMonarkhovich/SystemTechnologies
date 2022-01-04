package by.st.tests.ui.tests.search;

import by.st.tests.ui.tests.TestBase;
import by.st.tests.ui.tests.search.page.SearchPage;
import by.st.tests.ui.tests.search.page.SearchResultPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SearchTests extends TestBase {
    SearchPage help = new SearchPage();
    SearchResultPage result = new SearchResultPage();

    @ValueSource(strings = {
            "банк",
            "платформа",
            "документ"
    })
    @Feature("Поиск")
    @ParameterizedTest(name = "Проверка результатов поиска: {0}")
    void searchTest(String searchQuery) {
        help.openMainPage();
        help.setSearch(searchQuery);
        result.checkResults(searchQuery);
    }
}
