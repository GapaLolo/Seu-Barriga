package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import support.Uteis;

public class LoginPage extends Uteis{

    WebDriver driver;



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarTelalogin(){
//        if (tipo.equalsignoreCase("FIREFOX")){
//            getDriver(Browser.FIREFOX);
//        } else if (tipo.equalsignoreCase("EDGE")) {
//            getDriver(Browser.EDGE);
//        } else {
//            getDriver(Browser.Chrome);
//        }
        driver.get("https://seubarriga.wcaquino.me/login");
        esperarElementoPresente(By.id("bs-example-navbar-collapse-1"), 20);
    }

    public void preencherLogin(){
        preencherElemento(By.id("email"), 20, "wagner@aquino" );
        preencherElemento(By.id("senha"), 20, "123456");
        driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();
        esperarElementoPresente(By.xpath("//div[@class='alert alert-success']"), 20);


    }




}
