package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.RozetkaFactory;

public class MainPageElements extends RozetkaFactory {
    @FindBy(xpath = "//button[@class='header__button ng-star-inserted'][1]")
    protected WebElement btnLogin;
    @FindBy(css = "input#auth_email")
    protected WebElement inputEmailFld;
    @FindBy(xpath = "//input[@id='auth_email']//preceding::label")
    protected WebElement inputEmailTxt;
    @FindBy(css = "input#auth_pass")
    protected WebElement inputPasswordFld;
    @FindBy(css = "button.button.button--large.button--green.auth-modal__submit.ng-star-inserted")
    protected WebElement btnSubmit;
    @FindBy(xpath = "//h3[@class= 'modal__heading']")
    protected WebElement textLogin;
    @FindBy(css = "button.auth-modal__register-link.button.button--link.ng-star-inserted")
    protected WebElement btnRegistration;
    @FindBy(css = "button.button.button--large.button--gray.button--with-icon.auth-modal__social-button.auth-modal__social-button_type_facebook")
    protected WebElement btnFacebook;
    @FindBy(xpath = "//rz-social-auth/button[2]")
    protected WebElement btnGoogle;
    @FindBy(xpath = "//input[@id='auth_pass']/ancestor::div[@class = 'form__row validation_type_error']")
    protected WebElement textErrorPassword;
    @FindBy(xpath = "//input[@id='auth_email']/following-sibling::p[@class='error-message ng-star-inserted']")
    protected WebElement textErrorEmail;}