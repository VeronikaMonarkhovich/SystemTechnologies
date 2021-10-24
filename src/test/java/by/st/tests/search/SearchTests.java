package by.st.tests.search;

import by.st.tests.TestBase;
import by.st.tests.search.page.SearchPage;
import by.st.tests.search.page.SearchResultPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SearchTests extends TestBase {
    SearchPage help = new SearchPage();
    SearchResultPage result = new SearchResultPage();

    @ValueSource(strings = {
            "банк",
            "вакансии",
            "программа"
    })

    @ParameterizedTest(name = "Проверка результатов поиска: {0}")
    void searchTest(String searchQuery) {
        help.openMainPage();
        help.setSearch(searchQuery);
        result.checkResults(searchQuery);
    }
}
