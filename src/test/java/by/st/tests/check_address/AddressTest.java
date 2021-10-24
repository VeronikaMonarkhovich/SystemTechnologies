package by.st.tests.check_address;

import by.st.tests.TestBase;
import by.st.tests.check_address.page.AddressPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddressTest extends TestBase {
    @Test
    @DisplayName("Проверка адреса")
    void addressTest() {
        AddressPage page = new AddressPage();

        page.openMainPage();
        page.checkAddress();
    }
}
