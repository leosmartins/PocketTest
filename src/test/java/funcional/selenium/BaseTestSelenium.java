package funcional.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestSelenium {

    WebDriver driver = null;

    @BeforeClass
    public WebDriver before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        return driver = new ChromeDriver();
    }

    @AfterClass
    public void after(){
        driver.quit();
    }

}