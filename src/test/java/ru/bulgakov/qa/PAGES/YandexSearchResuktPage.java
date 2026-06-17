package ru.bulgakov.qa.PAGES;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class YandexSearchResuktPage {
    private final SelenideElement closeWindow = $(".DistributionButtonClose");

    public YandexSearchResuktPage closeDefaultBrowserSelectWindow() {
        closeWindow.click();

        return this;
    }

    public WelcomePage openLink(String websiteName) {
        $(byText(websiteName)).click();
        switchTo().window(1);
        return new WelcomePage();
    }
}
