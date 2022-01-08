package by.st.tests.ui.tests.check_address;

import by.st.tests.ui.tests.TestBase;
import by.st.tests.ui.tests.check_address.page.AddressPage;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddressTest extends TestBase {
    @Test

    @AllureId("6502")
    @Feature("Главная страница")
    @DisplayName("Проверка адреса")
    void addressTest() {
        AddressPage page = new AddressPage();

        page.openMainPage();
        page.checkAddress();
    }
}
