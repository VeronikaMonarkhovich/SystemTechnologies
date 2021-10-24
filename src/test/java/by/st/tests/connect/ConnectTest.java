package by.st.tests.connect;

import by.st.tests.TestBase;
import by.st.tests.connect.page.ConnectPage;
import by.st.tests.connect.page.ConnectResultsPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConnectTest extends TestBase {
    @Test
    @DisplayName("Проверка 'Связаться с нами'")
    void connectTest() {
        ConnectPage page = new ConnectPage();
        ConnectResultsPage result = new ConnectResultsPage();

        page.openMainPage();
        page.clickConnect();
        result.checkConnect();
    }
}
