package com.rozetka.tests;

import com.rozetka.data.ProductNames;
import com.rozetka.pages.common.RozetkaPage;
import com.rozetka.pages.search.SearchSuccessPage;
import com.sun.org.glassfish.gmbal.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import lombok.val;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;

@Epic("Positive Tests")
@Feature("Search Tests")
@Description("Test Description: Searches for an item and checks results")
public class SimpleTest {

    @BeforeMethod
    public void beforeMethod() {
        new RozetkaPage().launchApp();
    }

    @Test
    public void searchSamsung() {

        new RozetkaPage().searchItem(ProductNames.SAMSUNG);

        val results = new SearchSuccessPage();

        //checks are there a grid with 32 elements
        results.getResults().shouldHave(size(32));

        //checks is the first search result contains Samsung Galaxy M30s
        results.getResult(0).shouldHave(text("Samsung Galaxy M30s"));

        val phone = results
                .getResult(0)
                .getText()
                .split("\n")[0];

        assertThat(phone)
                .as("Incorrect Phone Name")
                .contains("Samsung");

        results.openItemDetailsPage(phone);

    }

}


