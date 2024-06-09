package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenLogin extends BaseScreen {

    @AndroidFindBy(id = "login_username")
    @iOSFindBy(accessibility = "login_username")
    private RemoteWebElement fieldEmail;

    @AndroidFindBy(id = "login_password")
    @iOSFindBy(accessibility = "login_password")
    private RemoteWebElement fieldPassword;

    @AndroidFindBy(id = "login_button")
    @iOSFindBy(accessibility = "login_button")
    private RemoteWebElement buttonContinue;

    public void writeEmail(String email) {
        fieldEmail.sendKeys(email);
    }

    public void writePassword(String senha) {
        fieldPassword.sendKeys(senha);
    }

    public void clickContinueButton() {
        buttonContinue.click();
    }

    public void login(String email, String senha) {
        writeEmail(email);
        writePassword(senha);
        clickContinueButton();
    }
}
