package com.rozetka.pages.common;

import com.codeborne.selenide.SelenideElement;
import com.rozetka.data.ApplicationStatus;
import com.rozetka.data.IProduct;
import com.rozetka.data.IUser;
import com.rozetka.pages.HomePage;
import com.rozetka.pages.account.LoginPopUp;
import com.rozetka.pages.search.SearchSuccessPage;
import com.rozetka.pages.search.SearchUnsuccessPage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public abstract class TopPart {
    //TODO component
    protected final String ACTIVE_LANGUAGE_XPATH = "//span[@class='header-topline__language-item_state_active']";

    private SelenideElement phone = $x("//span[@class='link-dashed']");
    private SelenideElement contacts = $x("//li[@class='header-topline__links-item']//a");
    private SelenideElement languageUA = $x("//a[contains(text(),'UA')]");
    private SelenideElement languageRU = $x("//a[contains(text(),'RU')]");
    private SelenideElement city = $x("//a[@class='header-cities__link link-dashed']");
    private SelenideElement account = $x("//a[@class='header-topline__user-link link-dashed']");
    private SelenideElement logo = $x("//a[@class='header__logo']//img");
    private SelenideElement catalog = $x("//span[@class='menu-toggler__text']");
    private SelenideElement searchTopField = $x("//input[@placeholder]");
    private SelenideElement searchMicrophoneButton = $x("//button[@class='search-form__microphone']");
    private SelenideElement searchTopButton =
            $x("//button[@class='button button_color_green button_size_medium search-form__submit']");
    private SelenideElement premiumButton =
            $x("//a[@class='header-actions__button header-actions__button_type_premium']");
    private SelenideElement compareButton = $x("//i[@class='header-actions__button-icon']");
    private SelenideElement wishList =
            $x("//a[@class='header-actions__button header-actions__button_type_wish']");
    private SelenideElement cartButton =
            $x("//a[@class='header-actions__button header-actions__button_type_basket']");
    //
    private AccountGuest accountGuest;

    // Page Object

    // phone
    public String getPhoneText() {
        return phone.getText();
    }

    public void clickPhone() {
        phone.click();
    }

    // contacts
    public String getContactsText() {
        return contacts.getText();
    }

    public Contacts clickContacts() {
        contacts.click();

        return new Contacts();
    }

    // languageUA
    public String getLanguageUAText() {
        return languageUA.getText();
    }

    public void clickLanguageUA() {
        languageUA.click();
    }

    // languageRU
    public String getLanguageRUText() {
        return languageRU.getText();
    }

    public void clickLanguageRU() {
        languageRU.click();
    }

    // city
    public String getCityText() {
        return city.getText();
    }

    public void clickCity() {
        city.click();
    }

    // account
    public String getAccountText() {
        return account.getText();
    }

    public void clickAccount() {
        account.click();
    }

    // logo
    public void clickLogo() {
        logo.click();
    }

    // catalog
    public String getCatalogText() {
        return catalog.getText();
    }

    public void clickCatalog() {
        catalog.click();
    }

    // searchTopField
    public void clearSearchTopField() {
        searchTopField.clear();
    }

    public void clickSearchTopField() {
        searchTopField.click();
    }

    public void setSearchTopField(String text) {
        searchTopField.sendKeys(text);
    }

    // searchMicrophoneButton
    public void clickSearchMicrophoneButton() {
        searchMicrophoneButton.click();
    }

    // searchTopButton
    public void clickSearchTopButton() {
        searchTopButton.click();
    }

    // premiumButton
    public String getPremiumButtonText() {
        return premiumButton.getText();
    }

    public void clickPremiumButton() {
        premiumButton.click();
    }

    // compareButton
    public String getCompareButtonText() {
        return compareButton.getText();
    }

    public void clickCompareButton() {
        compareButton.click();
    }

    // wishList
    public String getWishListText() {
        return wishList.getText();
    }

    public void clickWishList() {
        wishList.click();
    }

    // cartButton
    public String getCartButtonText() {
        return cartButton.getText();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    // accountGuest
    private void clickAccountGuestRegister() {
        accountGuest.clickRegister();
    }

    private void clickAccountGuestLogin() {
        accountGuest.clickLogin();
    }

    // Functional

    // account
    protected void openAccount() {
        clickAccount();
    }

    // searchTopField
    private void fillSearchTopField(String searchText) {
        clickSearchTopField();
        clearSearchTopField();
        setSearchTopField(searchText);
    }

    protected void defaultLogin(IUser user) {
        if (!ApplicationStatus.get().isLogged()) {
            new LoginPopUp()
                    .fillLogin(user);
        } else {
            // TODO throw Custom Exception
        }
    }

    // Business Logic

    public HomePage gotoHomePage() {
        clickLogo();

        return new HomePage();
    }

    public SearchSuccessPage successfulSearch(IProduct product) {
        fillSearchTopField(product.getName());
        clickSearchTopButton();

        return new SearchSuccessPage();
    }

    public SearchUnsuccessPage unsuccessfulSearch(IProduct product) {
        fillSearchTopField(product.getName());
        clickSearchTopButton();

        return new SearchUnsuccessPage();
    }

    //TODO LoginPage
    public LoginPopUp gotoLoginPage() {
        openAccount();

        return new LoginPopUp();
    }

}
