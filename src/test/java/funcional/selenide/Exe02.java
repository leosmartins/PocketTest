package funcional.selenide;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class Exe02 extends BaseTestSelenide {

    @Test(description = "Preenchimento de formulario online")
    public void teste01() {

        open("https://www.roboform.com/filling-test-all-fields");

        $(By.name("30_user_id")).setValue("Usuario Teste");
        sleep(1000);

        $(By.name("31password")).setValue("1234567");
        sleep(1000);

        $(By.name("40cc__type")).selectOptionContainingText("American Express");
        sleep(1000);

    }

}