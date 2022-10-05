package stepDefs;

import framework.Base;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;


public class first_test_feature extends Base {

    private WebDriver driver = getDriver();


    @Given("I do this")
    public void iDoThis() {
        driver.get("https://www.google.com");
    }

    @Given("I do that")
    public void iDoThat() {
        driver.get("https://www.nu.nl");
    }

    @Given("this will happen")
    public void thisWillHappen() {
        driver.get("https://www.ad.nl");
    }

}
