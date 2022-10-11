package stepDefs.S14_Scenario_Outline;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchPage;
import stepDefs.DriverManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ScenarioOutlineStepdefs {
    private WebDriver driver;
    HomePage homePage;
    SearchPage searchPage;

    public ScenarioOutlineStepdefs(DriverManager driverManager){
        this.driver = driverManager.driver;
        homePage = new HomePage(driver);
    }

    @When("I search a product called {string}")
    public void iSearchAProductCalled(String productName) {
        homePage.enterSearchTerm(productName);
        homePage.clickSearchButton();
    }

    @Then("at least one {string} should appear in the results")
    public void atLeastOneShouldAppearInTheResults(String productName) {
        searchPage = new SearchPage(driver);
        List<String> productNames = searchPage.getProductNames();

        for (String nameOfProduct : productNames) {
            assertThat(nameOfProduct)
                    .as("One or more product names did not contain the word " + productName)
                    .containsIgnoringCase(productName);
        }
    }
}
