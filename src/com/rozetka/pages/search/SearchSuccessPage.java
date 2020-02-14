package com.rozetka.pages.search;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class SearchSuccessPage {
    private ElementsCollection results = $$x("//div[@class='g-i-tile g-i-tile-catalog']");

    public SelenideElement getResult(int index) {
        return results.get(index);
    }

    public ElementsCollection getResults() {
        return results;
    }

    @Step("SearchResultsPage: opened Item Details Page")
    public ItemDetailsPage openItemDetailsPage(String itemName) {
        $x(format("//a[contains(text(),'%s')]", itemName)).click();

        return new ItemDetailsPage();
    }
}
