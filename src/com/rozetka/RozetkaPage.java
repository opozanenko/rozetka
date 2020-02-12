package com.rozetka;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class RozetkaPage {
    private final String ROZETKA_HOME_PAGE = "https://rozetka.com.ua/";

    private SelenideElement searchField = $x("//input[@placeholder]");

    //launch the App
    public void launchApp() {
        open(ROZETKA_HOME_PAGE);
    }

    //search for an item
    public void searchFor(ProductNames item) {
        searchField.val(String.valueOf(item)).pressEnter();
    }

}
