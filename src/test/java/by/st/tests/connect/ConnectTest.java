package by.st.tests.connect;

import by.st.tests.connect.page.ConnectPage;
import by.st.tests.connect.page.ConnectResultsPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConnectTest {
    @Test
    @DisplayName("Check Connect with us")
    void companyTest() {
        ConnectPage page = new ConnectPage();
        ConnectResultsPage result = new ConnectResultsPage();

        page.openMainPage();
        page.clickConnect();
        result.checkConnect();
    }
}
