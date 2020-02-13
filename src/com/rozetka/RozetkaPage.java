package com.rozetka;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.valueOf;

public class RozetkaPage {
    private final String ROZETKA_HOME_PAGE = "https://rozetka.com.ua/";

    private SelenideElement searchField = $x("//input[@placeholder]");

    @Step("Launch Rozetka App")
    public void launchApp() {
        open(ROZETKA_HOME_PAGE);
    }

    @Step("Search for Samsung")
    public SearchResultsPage searchItem(ProductNames item) {
        searchField
                .val(valueOf(item))
                .pressEnter();

        return new SearchResultsPage();
    }

}
