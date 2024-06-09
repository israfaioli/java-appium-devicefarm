package com.test.steps;

import com.test.screen.ScreenLogin;
import com.test.screen.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

    ScreenLogin screenLogin = new ScreenLogin();
    Utils utils = new Utils();

    @Dado("^que eu informe informe usuário \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void que_eu_informe_informe_usuário_e_senha(String email, String senha) {
        screenLogin.writePassword(senha);
    }

    @Quando("^eu clicar no botão logar$")
    public void eu_clicar_no_botão_logar() {
        screenLogin.clickContinueButton();
    }

    @Entao("^vou visualizar a home do aplicativo$")
    public void vou_visualizar_a_home_do_aplicativo() {

    }
}
