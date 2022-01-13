package by.st.tests.ui.tests.pages.enums;

public enum Languages {
    ENGLISH("Eng", "Effective IT-solutions"),
    RUSSIAN("Рус", "Эффективные IT-решения"),
    BELORUSSIAN("Бел", "Эфектыўныя IT-рашэнні");
    private final String desc;
    private final String slideContent;

    Languages(String desc, String slideContent) {
        this.desc = desc;
        this.slideContent = slideContent;
    }

    public String getDesc() {
        return desc;
    }

    public String getSlideContent() {
        return slideContent;
    }
}
