package ru.bulgakov.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Qatest {
    /*    @Test
    void mentoringPriceshouldbe47000Test() {
        /*
        тест кейс - проверить что цена за обучение - 47000 рублей
        1. открыть поисковик (яндекс)
        2. ввести данные сайта (bulgakov.qa)
        3.нажать кнопку поиск
        4.в поисковой выдаче найти нужный сайт, нажать на него
        5. нажать на кнопку стоимость
        5. нажать на кнопку "хочу вкатиться QA"
           5. нажать на кнопку "бегу оплачивать"
        6...
        10. проверить что к оплате 47000 рублей
         */
    //Configuration.holdBrowserOpen =true;

    //open("https://ivanbulgakovqa.ru/");
        /* у мен ячерез 1 страницы яндекса капча выскачила так что решил через сайт сразу
        $(byName("text")).setValue("bulgakov qa"); // Может перестать работать
        $("[type=submit]").click();

        sleep(500);
        $$(".t-menu__list li").last().click();
        $x("/html/body/div[1]/div[42]/div/div/div[32]/div/a").click();
        $(byText("Бегу оплачивать")).click();
        switchTo().window(1);
        $(".styles-module-scss-module__t92_WG__root")
                .shouldHave(Condition.matchText(".*47 000.*"), Duration.ofSeconds(10));

    }
}

         */


    @Test
    void checkingofAeroflopoints() {
        /*
        тест кейс - проверить какое количество миль будет начисленно за перелет оренбург- санкт питер туда обратно
         по тарифу бизнес базовый
        1. открыть поисковик (яндекс)
        2. ввести данные сайта (https://www.aeroflot.ru)
        3.нажать кнопку поиск
        4.в поисковой выдаче найти нужный сайт, нажать на него
        5.нажать в левом верхнем углу три полоски (вкладка меню)
        6. найти вкладку Аэрофлот бонус - каалькулятор полетных миль
        7. внести данные москва санкт питербург перелет туда обратно
        8. выбрать вкладку эконом сопоставить данные
         */
        Configuration.holdBrowserOpen = true;
        Configuration.timeout=20000;
        Configuration.pageLoadTimeout=20000;
        Configuration.browserSize = "1920x1080";

        open("https://ya.ru/");
        $(byName("text")).setValue("aeroflot");
        $("[type=submit]").click();
        $(".DistributionButtonClose").click();
        $(byText("aeroflot.ru")).click();
        switchTo().window(1);
        sleep(3500);
        $(".ant-btn-uncontained").click();
        $x("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div/div[3]/div[2]/div/div/ul/div[2]/span/a").click();
        sleep(2000);
        $("[placeholder=Откуда]").click();
        sleep(1500);
        $("[placeholder=Откуда]").clear(); // Очищаем поле
        sleep(1500);
        $("[placeholder=Откуда]").setValue("Оренбург");
        sleep(500);
        $(byText("REN")).click();
        $("[placeholder=Куда]").click();
        $("[placeholder=Куда]").clear();// Очищаем поле
        $("[placeholder=Куда]").setValue("санкт");
        $(byText("Санкт-Петербург")).click();
        sleep(3000);
        //$x("/html/body/div[2]/div[2]/div/div/div[2]/section[2]/div/div[2]/button[2]/span\n");
        //$(byText("Эконом")).click(); хотел эконом взять не получилось

        // Получаем значение миль со страницы (замените локатор на актуальный)
        String actualMiles = $(byXpath("/html/body/div[2]/div[2]/div/div/div[2]/section[2]/div/div[3]/div/div/div[4]/div[2]/div/div[2]/div/p")).getText();

// Ожидаемое значение
        String expectedMiles = "3 864¥";

// Сравнение с выводом результата
        if (actualMiles.equals(expectedMiles)) {
            System.out.println("✅ ВСЕ ХОРОШО - значение совпадает: " + actualMiles);
        } else {
            System.out.println("❌ ОШИБКА - ожидалось: " + expectedMiles + ", получено: " + actualMiles);
        }
    }
}