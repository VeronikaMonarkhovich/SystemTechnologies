package by.st.tests.check_address;

import by.st.tests.TestBase;
import by.st.tests.check_address.page.AddressPage;
import org.junit.jupiter.api.*;

public class AddressTest extends TestBase {
    @Test
    @DisplayName("Successful authorization")
    void loginTest() {
        AddressPage page = new AddressPage();

        page.openMainPage();
        page.checkAddress();
    }
}