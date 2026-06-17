package ru.bulgakov.qa.PAGES;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class WelcomePage {
    private final SelenideElement clickPriseButton = $$(".t-menu__list li").last();
    private final SelenideElement inputQA =  $(byText("Хочу вкатиться в QA"));
    private final SelenideElement payment =  $(byText("Бегу оплачивать"));


    public WelcomePage clickPrice() {
        clickPriseButton.click();
        return this;
    }

    public WelcomePage startCareer() {
        inputQA.click();
        return this;

    }

    public WebsitePayment TuttionFees() {
        payment.click();
        switchTo().window(2);
        return new WebsitePayment();

    }
}
