package com.rozetka.pages.account;

import com.codeborne.selenide.SelenideElement;
import com.rozetka.data.IUser;
import com.rozetka.pages.common.TopPart;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class LoginPopUp extends TopPart {

    private SelenideElement email = $x("//input[@id='auth_email']");
    private SelenideElement password = $x("//input[@id='auth_pass']");
    private SelenideElement forgotPassword = $x("//a[@class='link-dotted auth-modal__restore-link']");
    private SelenideElement loginButton =
            $x("//button[@class='button button_size_large button_color_green auth-modal__submit']");
    private SelenideElement register = $x("//a[@class='auth-modal__register-link']");

    // email
    public void clearEmailField() {
        email.clear();
    }

    public void clickEmailField() {
        email.click();
    }

    public void setEmail(String text) {
        email.sendKeys(text);
    }

    // password
    public void clearPasswordField() {
        password.clear();
    }

    public void clickPasswordField() {
        password.click();
    }

    public void setPassword(String text) {
        password.sendKeys();
    }

    // loginButton
    public void clickLoginButton() {
        loginButton.click();
    }

    // Functional

    private void enterEmail(String email) {
        clickEmailField();
        clearEmailField();
        setEmail(email);
    }

    private void enterPassword(String password) {
        clickPasswordField();
        clearPasswordField();
        setPassword(password);
    }

    public void fillLogin(IUser user) {
        enterEmail(user.getEmail());
        enterPassword(user.getPassword());
        clickLoginButton();
    }

    // Business Logic

    public LoggedUserPage successfulLogin(IUser validUser) {
        fillLogin(validUser);

        return new LoggedUserPage();
    }

//    public UnsuccessfulLoginPage unsuccessfulLogin(IUser invalidUser) {
//        fillLogin(invalidUser);
//
//        return new UnsuccessfulLoginPage();
//    }

}
