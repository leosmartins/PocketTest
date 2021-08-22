package funcional.selenide;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Exe01 extends BaseTestSelenide {

    @Test(description = "Realizar pesquisa no Google")
    public void teste01() {

        open("https://www.google.com/");
        $(By.name("q")).setValue("Selenide");
        $(By.name("btnK")).click();

    }

}