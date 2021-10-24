package by.st.tests.select_language;

import by.st.tests.TestBase;
import by.st.tests.select_language.page.LanguagePage;
import by.st.tests.select_language.page.LanguageResultPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LanguageTest extends TestBase {
    @Test
    @DisplayName("Выбор языка")
    void languageTest() {
        LanguagePage page = new LanguagePage();
        LanguageResultPage result = new LanguageResultPage();

        page.openMainPage();
        page.clickEng();
        result.checkResults();
    }
}