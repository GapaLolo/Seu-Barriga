package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

public class Uteis extends RunCucumberTest {

        public void esperarElementoPresente(By elemento, int tempo){
            WebDriverWait wait = new WebDriverWait(driver, tempo);
            wait.until(ExpectedConditions.elementToBeClickable(elemento));

        }

    public void clicarElemento(By elemento, int tempo){
        //driver.findElement(By.className(classname)).click();
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(elemento)).click();
    }

    public void preencherElemento(By elemento, int tempo, String texto) {
            //driver.findElement(By.id(id)).sendKeys(elemento);
            WebDriverWait wait = new WebDriverWait(driver, tempo);
            wait.until(ExpectedConditions.elementToBeClickable(elemento)).sendKeys(texto);
    }

    public void validarTexto(By elemento, int tempo, String textovalidar){
//            String texto = driver.findElement(By.className(classname)).getText();
//            Assert.assertEquals("O texto esta errado", textovalidar, texto);

            WebDriverWait wait = new WebDriverWait(driver, tempo);
            String textoesperado = wait.until(ExpectedConditions.elementToBeClickable(elemento)).getText();
            Assert.assertEquals("Texto incorreto", textoesperado, textovalidar);
    }


}
