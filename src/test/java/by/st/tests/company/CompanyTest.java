package by.st.tests.company;

import by.st.tests.TestBase;
import by.st.tests.company.page.CompanyPage;
import by.st.tests.company.page.CompanyResultPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CompanyTest extends TestBase {
    @Test
    @Feature("Меню навигации")
    @DisplayName("Проверка 'Компания'")
    void companyTest() {
        CompanyPage page = new CompanyPage();
        CompanyResultPage result = new CompanyResultPage();

        page.openMainPage();
        page.clickCompany();
        result.checkCompany();
    }
}
