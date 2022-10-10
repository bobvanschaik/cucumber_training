package framework;

import org.openqa.selenium.WebDriver;
import pages.*;

import static framework.BrowserFactory.Browser.CHROME;
import static framework.BrowserFactory.createBrowser;

public class Base {

    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected MyAccountPage myAccountPage;
    protected ContactPage contactPage;
    protected RegistrationPage registrationPage;
    protected SearchPage searchPage;

    public WebDriver getDriver() {
        if(driver == null){
            driver = createBrowser(CHROME);
        }
        return driver;
    }
}
