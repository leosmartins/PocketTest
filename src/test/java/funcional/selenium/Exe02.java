package funcional.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Exe02 extends BaseTestSelenium {

    @Test(description = "Preenchimento de formulario online")
    public void teste01() throws InterruptedException {

        driver.get("https://www.roboform.com/filling-test-all-fields");

        driver.findElement(By.name("30_user_id")).sendKeys("Usuario Teste");
        Thread.sleep(1000);

        driver.findElement(By.name("31password")).sendKeys("31password");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("40cc__type"))).selectByVisibleText("American Express");
        Thread.sleep(1000);

    }

}