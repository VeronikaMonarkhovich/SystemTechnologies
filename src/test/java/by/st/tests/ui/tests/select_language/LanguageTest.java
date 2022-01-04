package by.st.tests.ui.tests.select_language;

import by.st.tests.ui.tests.TestBase;
import by.st.tests.ui.tests.select_language.page.LanguagePage;
import by.st.tests.ui.tests.select_language.page.LanguageResultPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LanguageTest extends TestBase {
    @Test
    @Feature("Главная страница")
    @DisplayName("Выбор языка")
    void languageTest() {
        LanguagePage page = new LanguagePage();
        LanguageResultPage result = new LanguageResultPage();

        page.openMainPage();
        page.clickEng();
        result.checkResults();
    }
}