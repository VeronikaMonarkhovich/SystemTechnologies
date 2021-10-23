package by.st.tests.company;

import by.st.tests.company.page.CompanyPage;
import by.st.tests.company.page.CompanyResultPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import by.st.tests.TestBase;

public class CompanyTest extends TestBase {
    @Test
    @DisplayName("Language selection ")
    void companyTest() {
        CompanyPage page = new CompanyPage();
        CompanyResultPage result = new CompanyResultPage();

        page.openMainPage();
        page.clickCompany();
        result.checkCompany();
    }
}