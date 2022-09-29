package framework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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

    @BeforeEach
    public void setUp() {
        driver = createBrowser(CHROME);
        driver.manage().window().maximize();
        driver.get("https://webshop.mobiletestautomation.nl/");

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        myAccountPage = new MyAccountPage(driver);
        contactPage = new ContactPage(driver);
        registrationPage = new RegistrationPage(driver);
        searchPage = new SearchPage(driver);
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
