package ru.bulgakov.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import ru.bulgakov.qa.PAGES.Aeroflot.AeroWelcomePage;
import ru.bulgakov.qa.PAGES.Aeroflot.CalculatingPoints;
import ru.bulgakov.qa.PAGES.YandexSearchPage;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Qatest {
//    @Test
//    @DisplayName("Проверка цены оплаты за обучение")
//    @Tag("POSSITIVE")
//    void mentoringPriceshouldbe47000Test() {
//
//        Configuration.holdBrowserOpen = true;
//        Configuration.timeout = 20000;
//        Configuration.pageLoadTimeout = 20000;
//        Configuration.browserSize = "1920x1080";
//
//        YandexSearchPage yaSearch = new YandexSearchPage();
//
//        open("https://ya.ru/");
//        yaSearch
//                .search("bulgakov qa")
//                .submit()
//                .closeDefaultBrowserSelectWindow()
//                .openLink("ivanbulgakovqa.ru")
//                .clickPrice()
//                .startCareer()
//                .TuttionFees()
//                .priceTrening();
//
//
//    }
//}


@Test
    void checkingofAeroflopoints() {

        Configuration.holdBrowserOpen = true;
        Configuration.timeout=20000;
        Configuration.pageLoadTimeout=20000;
        Configuration.browserSize = "1920x1080";

    YandexSearchPage yaSearch = new YandexSearchPage();
    AeroWelcomePage aeroMain = new AeroWelcomePage();
    CalculatingPoints choosingCities = new CalculatingPoints();

    open("https://ya.ru/");
    yaSearch
            .search("aeroflot")
            .submit()
            .closeDefaultBrowserSelectWindow()
            .openLink("aeroflot.ru");
    aeroMain
            .mainMenu()
            .calculatorTab();
    choosingCities
            .cityDeparture()
            .clearCityDeparture()
            .entryDepartureCity()
            .choiseCityDepartureCode()
            .cityArrival()
            .clearCityArrival()
            .entryCityArrival()
            .choiseCityArrivalCode()
            .verifyMiles("3 864¥");
    }
}
