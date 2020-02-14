package com.rozetka.pages.common;

import com.codeborne.selenide.SelenideElement;
import com.rozetka.data.ProductNames;
import com.rozetka.pages.search.SearchSuccessPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.valueOf;

public class RozetkaPage {
    private final String ROZETKA_HOME_PAGE = "https://rozetka.com.ua/";

    private SelenideElement searchField = $x("//input[@placeholder]");

    @Step("Launch Rozetka App")
    public void launchApp() {
        //TODO val or xpath
        open(ROZETKA_HOME_PAGE);
    }

    @Step("Search for Samsung")
    public SearchSuccessPage searchItem(ProductNames item) {
        searchField
                .val(valueOf(item))
                .pressEnter();

        return new SearchSuccessPage();
    }

}
