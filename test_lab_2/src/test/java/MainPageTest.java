import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageTest {
    @Test
    void testSteps() {
        MainPage mainPage = new MainPage();
        mainPage.openLoginModal().verifyLoginModalUiElementsDispalyed().inputEmail().inputPassword().inputPassword().loginToAcc();
        mainPage.verifyHeader();
        mainPage.verifyRegistration();
        mainPage.verifyAlternativeLogin();
    }
    @Test
    void testLoginError() {
        MainPage mainPage1 = new MainPage();
        mainPage1.openLoginModal().verifyLoginModalUiElementsDispalyed().inputEmail().inputPassword().inputPassword().loginToAcc();
        mainPage1.verifyErrorLogin();
        mainPage1.verifyErrorPassword();
    }

}
