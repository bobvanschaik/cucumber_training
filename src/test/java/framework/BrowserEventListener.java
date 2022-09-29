package framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class BrowserEventListener implements WebDriverListener {

    private final WebDriver driver;

    public BrowserEventListener(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        highlightElement(element);
    }

    @Override
    public void beforeClick(WebElement element) {
        highlightElement(element);
    }

    private void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
                "color: red; border: 2px solid red;");
    }

}
