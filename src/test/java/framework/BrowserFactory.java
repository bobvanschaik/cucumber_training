package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;

class BrowserFactory {

    public enum Browser {
        CHROME,
        FIREFOX
    }

    static WebDriver createBrowser(Browser browser) {
        return switch (browser) {
            case CHROME -> createChromeBrowser();
            case FIREFOX -> createFireFoxBrowser();
        };
    }

    private static WebDriver createFireFoxBrowser() {
        WebDriverManager.firefoxdriver().setup();
        return webDriverWithListener(new FirefoxDriver(new FirefoxOptions()));
    }

    private static WebDriver createChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        return webDriverWithListener(new ChromeDriver(new ChromeOptions()));
    }

    private static WebDriver webDriverWithListener(WebDriver driver) {
        return new EventFiringDecorator(new BrowserEventListener(driver)).decorate(driver);
    }

}
