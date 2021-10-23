package by.st.tests.select_language;

import by.st.tests.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import by.st.tests.select_language.page.LanguagePage;
import by.st.tests.select_language.page.LanguageResultPage;

public class LanguageTest extends TestBase {


    @Test
    @DisplayName("Select language ")
    void languageTest() {
        LanguagePage page = new LanguagePage();
        LanguageResultPage result = new LanguageResultPage();

        page.openMainPage();
        page.clickEng();
        result.checkResults();
    }
}