package framework;

import org.openqa.selenium.WebDriver;
import pages.*;
import stepDefs.DriverManager;

import static framework.BrowserFactory.Browser.CHROME;
import static framework.BrowserFactory.createBrowser;
import static stepDefs.DriverManager.getFinalDriver;
import static stepDefs.DriverManager.setupClass;

public class Base {

    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected MyAccountPage myAccountPage;
    protected ContactPage contactPage;
    protected RegistrationPage registrationPage;
    protected SearchPage searchPage;

    public WebDriver getDriver() {
        if (getFinalDriver() != null) {
            return getFinalDriver();
        }
        else{
            setupClass();
            return getFinalDriver();
        }
    }
}
