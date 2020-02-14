package com.rozetka.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

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

    // Page Object

    // phone
    public SelenideElement getPhone() {
        return phone;
    }

    public String getPhoneText() {
        return getPhone().getText();
    }

    public void clickPhone() {
        getPhone().click();
    }

    // contacts
    public SelenideElement getContacts() {
        return contacts;
    }

    public String getContactsText() {
        return getContacts().getText();
    }

    public void clickContacts() {
        getContacts().click();
    }

    // languageUA
    public SelenideElement getLanguageUA() {
        return languageUA;
    }

    public String getLanguageUAText() {
        return getLanguageUA().getText();
    }

    public void clickLanguageUA() {
        getLanguageUA().click();
    }

    // languageRU
    public SelenideElement getLanguageRU() {
        return languageRU;
    }

    public String getLanguageRUText() {
        return getLanguageRU().getText();
    }

    public void clickLanguageRU() {
        getLanguageRU().click();
    }

    // city
    public SelenideElement getCity() {
        return city;
    }

    public String getCityText() {
        return getCity().getText();
    }

    public void clickCity() {
        getCity().click();
    }

    // account
    public SelenideElement getAccount() {
        return account;
    }

    public String getAccountText() {
        return getAccount().getText();
    }

    public void clickAccount() {
        getAccount().click();
    }

    // logo
    public SelenideElement getLogo() {
        return logo;
    }

    public void clickLogo() {
        getLogo().click();
    }

    // catalog
    public SelenideElement getCatalog() {
        return catalog;
    }

    public String getCatalogText() {
        return getCatalog().getText();
    }

    public void clickCatalog() {
        getCatalog().click();
    }

    // searchTopField
    public SelenideElement getSearchTopField() {
        return searchTopField;
    }

    public void clearSearchTopField() {
        getSearchTopField().clear();
    }

    public void clickSearchTopField() {
        getSearchTopField().click();
    }

    public void setSearchTopField(String text) {
        getSearchTopField().sendKeys(text);
    }

    // searchMicrophoneButton
    public SelenideElement getMicrophoneButton() {
        return searchMicrophoneButton;
    }

    public void clickMicrophoneButton() {
        getMicrophoneButton().click();
    }

    // searchTopButton
    public SelenideElement getSearchTopButton() {
        return searchTopButton;
    }

    public void clickSearchTopButton() {
        getSearchTopButton().click();
    }

    // premiumButton
    public SelenideElement getPremiumButton() {
        return premiumButton;
    }

    public String getPremiumButtonText() {
        return getPremiumButton().getText();
    }

    public void clickPremiumButton() {
        getPremiumButton().click();
    }

    // compareButton
    public SelenideElement getCompareButton() {
        return compareButton;
    }

    public String getCompareButtonText() {
        return getCompareButton().getText();
    }

    public void clickCompareButton() {
        getCompareButton().click();
    }

    // wishList
    public SelenideElement getWishList() {
        return wishList;
    }

    public String getWishListText() {
        return getWishList().getText();
    }

    public void clickWishList() {
        getWishList().click();
    }

    // cartButton
    public SelenideElement getCartButton() {
        return cartButton;
    }

    public String getCartButtonText() {
        return getCartButton().getText();
    }

    public void clickCartButton() {
        getCartButton().click();
    }

}
