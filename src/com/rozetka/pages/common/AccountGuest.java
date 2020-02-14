package com.rozetka.pages.common;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class AccountGuest {

    private SelenideElement register = $x("//a[@class='auth-modal__register-link']");
    private SelenideElement login =
            $x("//button[@class='button button_size_large button_color_green auth-modal__submit']");

    // register
    public String getRegisterText() {
        return register.getText();
    }

    public void clickRegister() {
        register.click();
    }

    // login
    public String getLoginText() {
        return login.getText();
    }

    public void clickLogin() {
        login.click();
    }

}
