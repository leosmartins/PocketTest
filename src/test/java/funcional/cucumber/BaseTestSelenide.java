package funcional.cucumber;

import funcional.CustomTestListener;
import funcional.CustomWebDriveListener;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.WebDriverRunner.addListener;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

@Listeners(CustomTestListener.class)
public abstract class BaseTestSelenide extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void before() {
        baseUrl = "";
        startMaximized = true;
        headless = false;
        holdBrowserOpen = false;
        screenshots = true;
        savePageSource = true;

        addListener(new CustomWebDriveListener());
    }

    @AfterClass
    public void after() {
        closeWebDriver();
    }
}
