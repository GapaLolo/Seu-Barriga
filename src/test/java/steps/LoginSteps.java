package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage(driver);


    @Dado("^que estou na tela de login de usuario$")
    public void que_estou_na_tela_de_login_de_usuario() throws Throwable {
        loginPage.acessarTelalogin();

    }
    @E("^acesso com um usuario existente$")
    public void acesso_com_um_usuario_existente() throws Throwable{
        loginPage.preencherLogin();
    }


}
