package ru.bulgakov.qa.PAGES.Aeroflot;

import com.codeborne.selenide.SelenideElement;
import ru.bulgakov.qa.PAGES.WelcomePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AeroWelcomePage {
    private final SelenideElement openMenu = $(".ant-btn-uncontained");
    private final SelenideElement calculator = $x("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div/div[3]/div[2]/div/div/ul/div[2]/span/a");


    public AeroWelcomePage mainMenu () {
        openMenu.click();

        return this;
    }
    public CalculatingPoints calculatorTab () {
        calculator.click();

        return new CalculatingPoints();
    }
}

