package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    @Quando("^eu preencho o formulario de cadastro$")
    public void eu_preencho_o_formulario_de_cadastro() throws Throwable {
        cadastroPage.preencherCadastro();
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() throws Throwable {
        cadastroPage.clicarSalvar();
    }

    @Entao("^vejo a mensagem de sucesso de cadastro$")
    public void vejo_a_mensagem_de_sucesso_de_cadastro() throws Throwable {
        cadastroPage.validarSucesso();
    }
}
