package ru.bulgakov.qa.PAGES;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class WebsitePayment {
    private final SelenideElement checkPrice = $(".styles-module-scss-module__t92_WG__root");


    public WebsitePayment priceTrening() {
        checkPrice.shouldHave(Condition.matchText(".*47 000.*"), Duration.ofSeconds(10));
        return this;
    }
}
