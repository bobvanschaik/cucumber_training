package stepDefs.S05_POM;

import framework.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import stepDefs.DriverManager;

import static org.assertj.core.api.Assertions.assertThat;

public class SubscribeNewsletterTestStepdefs{
    private WebDriver driver;
    HomePage homePage;

    @When("I subscribe to the news letter with a valid email address")
    public void iSubscribeToTheNewsLetterWithAValidEmailAddress() {
        homePage.subscribeToNewsLetter();
    }

    public SubscribeNewsletterTestStepdefs(DriverManager driverManager){
        this.driver = driverManager.driver;
        homePage = new HomePage(driver);
    }



    @Then("I should be shown a successfully subscribed confirmation")
    public void iShouldBeShownASuccessfullySubscribedConfirmation() {
        assertThat(homePage.getNewsLetterSubscribtionAlert().getText())
                .isEqualTo("You have successfully subscribed to this newsletter.");
    }
}
