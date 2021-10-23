package by.st.tests;

import by.st.tests.check_address.page.AddressPage;
import by.st.tests.company.page.CompanyPage;
import by.st.tests.company.page.CompanyResultPage;
import by.st.tests.connect.page.ConnectPage;
import by.st.tests.connect.page.ConnectResultsPage;
import by.st.tests.search.page.SearchPage;
import by.st.tests.search.page.SearchResultPage;
import by.st.tests.select_language.page.LanguagePage;
import by.st.tests.select_language.page.LanguageResultPage;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SystemTechnologiesTest extends TestBase {
    @Test
    @DisplayName("Проверка адресса")
    void addressTest() {
        AddressPage page = new AddressPage();

        page.openMainPage();
        page.checkAddress();
    }

    @Test
    @DisplayName("Проверка 'Компания'")
    void companyTest() {
        CompanyPage page = new CompanyPage();
        CompanyResultPage result = new CompanyResultPage();

        page.openMainPage();
        page.clickCompany();
        result.checkCompany();
    }

    @Test
    @DisplayName("Проверка 'Связаться с нами'")
    void connectTest() {
        ConnectPage page = new ConnectPage();
        ConnectResultsPage result = new ConnectResultsPage();

        page.openMainPage();
        page.clickConnect();
        result.checkConnect();
    }

    @Test
    @DisplayName("Выбор языка")
    void languageTest() {
        LanguagePage page = new LanguagePage();
        LanguageResultPage result = new LanguageResultPage();

        page.openMainPage();
        page.clickEng();
        result.checkResults();
    }

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