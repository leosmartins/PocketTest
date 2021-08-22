package funcional.selenide;

import funcional.CustomTestListener;
import funcional.CustomWebDriveListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.WebDriverRunner.addListener;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

@Listeners(CustomTestListener.class)
public abstract class BaseTestSelenide {

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
