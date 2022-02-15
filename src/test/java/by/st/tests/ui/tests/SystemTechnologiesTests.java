package by.st.tests.ui.tests;

import by.st.tests.ui.tests.pages.*;
import by.st.tests.ui.tests.pages.enums.Languages;
import by.st.tests.ui.tests.pages.enums.MenuButtons;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static by.st.tests.ui.tests.pages.enums.Languages.RUSSIAN;

public class SystemTechnologiesTests extends TestBase {

    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    ConnectPage connectPage = new ConnectPage();
    MenuButtonResultPages menuButtonResultPage = new MenuButtonResultPages();

    @EnumSource(Languages.class)
    @Feature("Главная страница")
    @ParameterizedTest(name = "Выбор  языка {0}")
    @AllureId("6501")
    void selectLanguageTest(Languages language) {
        mainPage.clickLanguage(language.getDesc());
        mainPage.checkLanguage(language.getSlideContent());
    }

    @ValueSource(strings = {
            "банк",
            "платформа",
            "документ"
    })
    @Feature("Поиск")
    @ParameterizedTest(name = "Проверка результатов поиска: {0}")
    @AllureId("6502")
    void searchTest(String searchQuery) {
        mainPage.clickLanguage(RUSSIAN.getDesc());
        mainPage.setSearch(searchQuery);
        searchResultPage.checkResults(searchQuery);
    }

    @Test
    @AllureId("6500")
    @Feature("Меню навигации")
    @DisplayName("Проверка раздела 'Связаться с нами'")
    void connectWithUsTest() {
        mainPage.clickLanguage(RUSSIAN.getDesc());
        mainPage.clickConnectWithUs();
        connectPage.checkConnectWithUs();
    }

    @EnumSource(MenuButtons.class)
    @Feature("Меню навигации")
    @AllureId("6503")
    @ParameterizedTest(name = "Проверка раздела меню {0}")
    void menuButtonsTests(MenuButtons menuButton) {
        mainPage.clickLanguage(RUSSIAN.getDesc());
        mainPage.clickButton(menuButton.getDesc());
        menuButtonResultPage.checkHeader(menuButton.getHeader());
    }
}