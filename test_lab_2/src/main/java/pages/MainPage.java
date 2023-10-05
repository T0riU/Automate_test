package pages;

import elements.MainPageElements;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.SoftAssertions;
import utils.DriverConfig;

import java.lang.ref.SoftReference;

public class MainPage extends MainPageElements {
    private static final DriverConfig cfg = ConfigFactory.create(DriverConfig.class);
    public static MainPage getInstance(){
        return new MainPage();
    }

    public MainPage openLoginModal() {
        btnLogin.click();
        return getInstance();
    }
    public MainPage inputEmail() {
        inputEmailFld.sendKeys(cfg.email());
        return getInstance();
    }
    public MainPage inputPassword() {
        inputPasswordFld.sendKeys(cfg.password());
        return getInstance();
    }
    public MainPage loginToAcc() {
        btnSubmit.click();
        return getInstance();
    }

    public MainPage verifyLoginModalUiElementsDispalyed() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(inputEmailFld.isDisplayed()).describedAs("Email field 1").isTrue();
        softAssertions.assertThat(inputEmailTxt.isDisplayed()).describedAs("Email field 2").isTrue();
        softAssertions.assertThat(inputEmailTxt.getText()).describedAs("Email field 3").isEqualTo("Ел. пошта або телефон");
        softAssertions.assertAll();
        return getInstance();
    }
    public MainPage verifyHeader() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(textLogin.isDisplayed()).describedAs("Header is displayed").isTrue();
        softAssertions.assertThat(textLogin.getText()).describedAs("Header have text").isEqualTo("Вхід");
        softAssertions.assertThat(btnRegistration.getText()).describedAs("Header has text").isEqualTo("Зареєструватися");
        softAssertions.assertAll();
        return getInstance();
    }
    public MainPage verifyRegistration() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(btnRegistration.isDisplayed()).describedAs("Registration is displayed").isTrue();
        softAssertions.assertThat(btnRegistration.getText()).describedAs("Registration has text").isEqualTo("Зареєструватися");
        softAssertions.assertAll();
        return getInstance();
    }

    public MainPage verifyAlternativeLogin() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(btnFacebook.isDisplayed()).describedAs("Facebook btn is displayed").isTrue();
        softAssertions.assertThat(btnFacebook.getText()).describedAs("Facebook btn has text").isEqualTo("Facebook");
        softAssertions.assertThat(btnGoogle.isDisplayed()).describedAs("Google btn is displayed").isTrue();
        softAssertions.assertThat(btnGoogle.getText()).describedAs("Google btn has text").isEqualTo("Google");
        softAssertions.assertAll();
        return getInstance();
    }
    public MainPage verifyErrorLogin() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(textErrorEmail.isDisplayed()).describedAs("Email Error is displayed").isTrue();
        softAssertions.assertThat(textErrorEmail.getText()).describedAs("Email Error has text").isEqualTo("Введено невірну адресу ел. пошти або номер телефону");
        softAssertions.assertAll();
        return getInstance();
    }
    public MainPage verifyErrorPassword() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(textErrorPassword.isDisplayed()).describedAs("Pass Error is displayed").isTrue();
        softAssertions.assertAll();
        return getInstance();
    }
}
