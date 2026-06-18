package ru.bulgakov.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import ru.bulgakov.qa.PAGES.Aeroflot.AeroWelcomePage;
import ru.bulgakov.qa.PAGES.Aeroflot.MilesCalculatorPage;
import ru.bulgakov.qa.PAGES.YandexSearchPage;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    MilesCalculatorPage page = new MilesCalculatorPage();

    open("https://ya.ru/");
    yaSearch
            .search("aeroflot")
            .submit()
            .closeDefaultBrowserSelectWindow()
            .openLink("aeroflot.ru");
    aeroMain
            .mainMenu()
            .calculatorTab()
            .cityDeparture()
            .clearCityDeparture()
            .enterDepartureCity("сочи")
            .chooseCityDepartureCode("AER")
            .cityArrival()
            .clearCityArrival()
            .enterCityArrival("санкт")
            .chooseCityArrivalCode("LED");
    assertEquals("3 864¥", page.getMilesResult());
    }
}
