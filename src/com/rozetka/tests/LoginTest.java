package com.rozetka.tests;

import com.codeborne.selenide.Condition;
import com.rozetka.data.IUser;
import com.rozetka.data.UserRepository;
import com.rozetka.pages.account.LoginPopUp;
import com.rozetka.pages.common.RozetkaPage;

import lombok.val;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;

public class LoginTest {

    @BeforeMethod
    public void beforeMethod() {
        new RozetkaPage().launchApp();
    }

    @DataProvider
    public Object[][] correctUsers() {
        return new Object[][] {
                { UserRepository.get().getHahaha() },
        };
    }

    @Test(dataProvider = "correctUsers")
    public void login(IUser user) {

        val test = new LoginPopUp();
        test.openAccount();
        test.fillLogin(user);

        $x("//a[@class='header-topline__user-link link-dashed']").shouldHave(Condition.appear);

    }

}
