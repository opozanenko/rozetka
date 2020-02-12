package com.rozetka;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchResultsPage {
    private ElementsCollection results = $$x("//div[@class='g-i-tile g-i-tile-catalog']");

    public SelenideElement getResult(int index) {
        return results.get(index);
    }

    public ElementsCollection getResults() {
        return results;
    }
}
