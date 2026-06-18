package ru.bulgakov.qa.PAGES.Aeroflot;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

// что за название? непонятное что за страница
public class MilesCalculatorPage {
    private final SelenideElement departureCity = $("[placeholder=Откуда]");
    private final SelenideElement arrivalCity = $("[placeholder=Куда]");
    private final SelenideElement milesResult = $(byXpath("/html/body/div[2]/div[2]/div/div/div[2]/section[2]/div/div[3]/div/div/div[4]/div[2]/div/div[2]/div/p"));

    public MilesCalculatorPage cityDeparture () {
        departureCity.click();
        sleep(3000);
        return this;
    }

    public MilesCalculatorPage clearCityDeparture () {
        departureCity.clear();
        return this;
    }

    public MilesCalculatorPage enterDepartureCity (String city) {
        departureCity.setValue(city);
        return this;
    }

    public MilesCalculatorPage chooseCityDepartureCode(String cityCode) {
        $(byText(cityCode)).click();
        return this;
    }

    public MilesCalculatorPage cityArrival() {
        arrivalCity.click();
        return this;
    }

    public MilesCalculatorPage clearCityArrival() {
        arrivalCity.clear();
        return this;
    }

    public MilesCalculatorPage enterCityArrival(String city) {
        arrivalCity.setValue(city);
        return this;
    }

    public MilesCalculatorPage chooseCityArrivalCode(String cityCode) {
        $(byText(cityCode)).click();
        return this;
    }

    public String getMilesResult() {
        return milesResult.getText();
    }
}
