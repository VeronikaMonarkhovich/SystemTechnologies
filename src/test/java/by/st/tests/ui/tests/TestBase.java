package by.st.tests.ui.tests;

import by.st.tests.ui.helpers.Attaches;
import by.st.tests.ui.configs.App;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class TestBase {

    @BeforeAll
    static void setup() {
        addListener("AllureSelenide", new AllureSelenide());
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
        Configuration.remote = App.config.remoteUrl();
        Configuration.baseUrl = App.config.webUrl();
    }

    @BeforeEach
    public void openMainPage() {
        open("");
    }

    @AfterEach
    public void tearDown() {
        Attaches.addScreenshotAs("Last screenshot");
        Attaches.addPageSource();
        Attaches.addBrowserConsoleLogs();
        Attaches.addVideo();
    }
}