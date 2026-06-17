package ru.bulgakov.qa.PAGES;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class YandexSearchPage {
private final SelenideElement searchInput = $(byName("text"));
private final SelenideElement submitButton = $("[type=submit]");

    public YandexSearchPage search(String query) {
        searchInput.setValue(query);
        return this;
    }

    public YandexSearchResuktPage submit() {
        submitButton.click();
        return new YandexSearchResuktPage();
    }
}

