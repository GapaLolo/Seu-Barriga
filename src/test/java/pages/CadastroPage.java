package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Uteis;

public class CadastroPage extends Uteis {

    WebDriver driver;

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCadastro(){
        clicarElemento(By.className("dropdown-toggle"),20);
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a")).click();
        esperarElementoPresente(By.id("nome"), 20);
        preencherElemento(By.id("nome"), 20, "Gabriel Prado Lolo");
    }

    public void clicarSalvar(){
        //driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/button")).click();
        clicarElemento(By.xpath("/html/body/div[2]/form/div[2]/button"), 20);
    }


    public void validarSucesso(){
        validarTexto(By.xpath("//div[@class='alert alert-success']"), 20, "Conta adicionada com sucesso!");
    }
}
