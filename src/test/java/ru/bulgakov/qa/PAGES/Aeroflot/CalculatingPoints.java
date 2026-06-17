package ru.bulgakov.qa.PAGES.Aeroflot;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class CalculatingPoints {
    private final SelenideElement departureCity = $("[placeholder=Откуда]");
    private final SelenideElement DepartureCityCode = $(byText("REN"));
    private final SelenideElement arrivalCity = $("[placeholder=Куда]");
    private final SelenideElement arrivalCityCode = $(byText("LED"));
    private final SelenideElement milesResult = $(byXpath("/html/body/div[2]/div[2]/div/div/div[2]/section[2]/div/div[3]/div/div/div[4]/div[2]/div/div[2]/div/p"));
    public CalculatingPoints cityDeparture () {
        departureCity.click();
        sleep(3000);
        return this;
    }

    public CalculatingPoints clearCityDeparture () {
        departureCity.clear();
        return this;
    }

    public CalculatingPoints entryDepartureCity () {
        departureCity.setValue("Оренбург");
        return this;
    }

    public CalculatingPoints choiseCityDepartureCode() {
        DepartureCityCode.click();
        return this;
    }

    public CalculatingPoints cityArrival() {
        arrivalCity.click();
        return this;
    }
    public CalculatingPoints clearCityArrival() {
        arrivalCity.clear();
        return this;
    }
    public CalculatingPoints entryCityArrival() {
        arrivalCity.setValue("санкт");
        return this;
    }
    public CalculatingPoints choiseCityArrivalCode() {
        arrivalCityCode.click();
        return this;
    }

    public void verifyMiles(String expectedMiles) {
        String actualMiles = milesResult.getText();

        if (actualMiles.equals(expectedMiles)) {
            System.out.println("✅ ВСЕ ХОРОШО - значение совпадает: " + actualMiles);
        } else {
            System.out.println("❌ ОШИБКА - ожидалось: " + expectedMiles + ", получено: " + actualMiles);
        }
    }
}
