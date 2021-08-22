package funcional.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Exe01 extends BaseTestSelenium {

    @Test(description = "Realizar pesquisa no Google")
    public void teste01() throws InterruptedException {

        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");

        Thread.sleep(1000);

        driver.findElement(By.name("btnK")).click();
    }

}