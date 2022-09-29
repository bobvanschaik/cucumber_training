package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

    // Elements:
    private final By loginLink = By.cssSelector(".user-info a");
    private final By contactLink = By.cssSelector("#contact-link");
    private final By logoutLink = By.cssSelector(".logout");
    private final By myAccountLink = By.cssSelector(".account");
    private final By searchBox = By.cssSelector("#search_widget input[name='s']");
    private final By searchButton = By.cssSelector("#search_widget button");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Actions:
    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void clickContactLink() {
        driver.findElement(contactLink).click();
    }

    public boolean logoutLinkIsDisplayed() {
        return driver.findElement(logoutLink).isDisplayed();
    }

    public String getLoggedInName() {
        return driver.findElement(myAccountLink).getText();
    }

    public void enterSearchTerm(String searchTerm) {
        driver.findElement(searchBox).sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

}
