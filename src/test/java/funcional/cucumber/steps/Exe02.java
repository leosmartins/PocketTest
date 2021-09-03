package funcional.cucumber.steps;

import funcional.cucumber.BaseTestSelenide;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class Exe02 extends BaseTestSelenide {

    @Quando("navegar para a pagina do formulario")
    public void navegar_para_a_pagina_do_formulario() {
        // Write code here that turns the phrase above into concrete actions
        open("https://www.roboform.com/filling-test-all-fields");
    }

    @Entao("devo preencher os campos")
    public void devo_preencher_os_campos() {
        // Write code here that turns the phrase above into concrete actions
        $(By.name("30_user_id")).setValue("Usuario Teste");
        sleep(1000);

        $(By.name("31password")).setValue("1234567");
        sleep(1000);

        $(By.name("40cc__type")).selectOptionContainingText("American Express");
        sleep(1000);
    }

}