package funcional.cucumber.steps;

import funcional.cucumber.BaseTestSelenide;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Exe01 extends BaseTestSelenide {


    @Quando("navegar para a pagina")
    public void navegarParaAPagina() {
        // Write code here that turns the phrase above into concrete actions
        open("https://www.google.com/");
    }

    @Entao("realizar a pesquisa de algum termo")
    public void realizarAPesquisaDeAlgumTermo() {
        // Write code here that turns the phrase above into concrete actions
        $(By.name("q")).setValue("Selenide");
    }

    @Entao("devo obter um conjunto de resultados")
    public void devoObterUmConjuntoDeResultados() {
        // Write code here that turns the phrase above into concrete actions
        $(By.name("btnK")).click();
    }
}
