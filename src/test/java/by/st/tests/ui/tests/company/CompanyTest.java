package by.st.tests.ui.tests.company;

import by.st.tests.ui.tests.TestBase;
import by.st.tests.ui.tests.company.page.CompanyPage;
import by.st.tests.ui.tests.company.page.CompanyResultPage;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CompanyTest extends TestBase {
    @Test

    @AllureId("6503")
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
