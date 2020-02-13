package com.rozetka;

import lombok.val;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;

/*
    This class contains test which searches for an item and checks results
 */
public class SimpleTest {

    @BeforeMethod
    public void beforeMethod() {
        new RozetkaPage().launchApp();
    }

    @Test
    public void searchSamsung() {

        new RozetkaPage().searchItem(ProductNames.SAMSUNG);

        val results = new SearchResultsPage();

        //checks are there a grid with 32 elements
        results.getResults().shouldHave(size(32));

        //checks is the first search result contains Samsung Galaxy M30s
        results.getResult(0).shouldHave(text("Samsung Galaxy M30s"));
    }

}


