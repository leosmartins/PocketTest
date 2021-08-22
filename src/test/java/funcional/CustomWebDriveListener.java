package funcional;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class CustomWebDriveListener extends AbstractWebDriverEventListener {

    public static <T extends WebElement> T highlighter(WebDriver driver, T element) {

        String old_bgColor = element.getCssValue("background-color");
        String old_border = element.getCssValue("border");

        String new_bgColor = "yellow";
        String new_border = "2px solid red";

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].setAttribute('style', 'background: " + new_bgColor + "; border: " + new_border + ";');", element);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        executor.executeScript("arguments[0].setAttribute('style', 'background: " + old_bgColor + "; border: " + old_border + ";');", element);

        return element;
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        highlighter(driver, element);
    }
}