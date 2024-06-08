package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenLogin extends BaseScreen {

    @AndroidFindBy(id = "login_username")
    @iOSFindBy(accessibility = "login_username")
    private RemoteWebElement campoEmail;

    @AndroidFindBy(id = "login_password")
    @iOSFindBy(accessibility = "login_password")
    private RemoteWebElement campoSenha;

    @AndroidFindBy(id = "login_button")
    @iOSFindBy(accessibility = "login_button")
    private RemoteWebElement botaoContinuar;

    public void escreverEmail(String email) {
        campoEmail.sendKeys(email);
    }

    public void escreverSenha(String senha) {
        campoSenha.sendKeys(senha);
    }

    public void clicarBotaoContinuar() {
        botaoContinuar.click();
    }

    public void realizarLogin(String email, String senha) {
        escreverEmail(email);
        escreverSenha(senha);
        clicarBotaoContinuar();
    }
}
