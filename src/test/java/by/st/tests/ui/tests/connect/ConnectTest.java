package by.st.tests.ui.tests.connect;

import by.st.tests.ui.tests.TestBase;
import by.st.tests.ui.tests.connect.page.ConnectPage;
import by.st.tests.ui.tests.connect.page.ConnectResultsPage;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConnectTest extends TestBase {
    @Test
    @AllureId("6500")
    @Feature("Меню навигации")
    @DisplayName("Проверка 'Связаться с нами'")
    void connectTest() {
        ConnectPage page = new ConnectPage();
        ConnectResultsPage result = new ConnectResultsPage();

        page.openMainPage();
        page.clickConnect();
        result.checkConnect();
    }
}
