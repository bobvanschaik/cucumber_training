package stepDefs;

import framework.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepdefs extends Base{
    private WebDriver driver = getDriver();
    private HomePage homePage;

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        driver.manage().window().maximize();
        driver.get("https://webshop.mobiletestautomation.nl");
        homePage = new HomePage(driver);
        assertThat(homePage.getPageTitle())
                .isEqualTo("Valori Automation Practice Shop");
    }

    @When("I log into my personal account")
    public void iLogIntoMyPersonalAccount() {
    }

    @Then("I should be taken to my profile page")
    public void iShouldBeTakenToMyProfilePage() {
        driver.quit();
    }
}

