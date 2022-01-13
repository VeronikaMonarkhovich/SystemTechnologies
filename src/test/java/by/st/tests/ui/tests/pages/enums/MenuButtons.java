package by.st.tests.ui.tests.pages.enums;

public enum MenuButtons {
    COMPANY("Компания", "О компании"),
    SOLUTIONS("Продукты", "Продукты"),
    SMARTCITY("SmartCity", "SmartCity"),
    FINTECH("Fintech", "Fintech-сервисы"),
    PARTNERS("Партнеры", "Партнеры"),
    SERVICES("Услуги", "Услуги"),
    NEWS("Новости", "Новости"),
    CAREER("Карьера", "Работа в компании");

    private final String desc;
    private final String header;

    MenuButtons(String desc, String header) {
        this.desc = desc;
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public String getHeader() {
        return header;
    }
}
