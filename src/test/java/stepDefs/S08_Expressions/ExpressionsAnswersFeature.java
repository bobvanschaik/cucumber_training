package stepDefs.S08_Expressions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class ExpressionsAnswersFeature {


    @Given("^I live in (Utrecht|Amsterdam|Hilversum)$")
    public void iLiveInUtrecht() {
    }

    @Then("^my zipcode is ([0-9]{4}[A-Z]{2})$")
    public void myZipcodeIsAB(int zipNumbers, String zipLetters) {
        System.err.printf("My zipcode is %d%s", zipNumbers, zipLetters);
    }


    @Then("the temperature is {double}°C")
    public void theTemperatureIsC(double temp) {
        System.err.println("The current temperature is "+temp);
    }

    @Given("I look at the thermostat")
    public void iLookAtTheThermostat() {
        System.err.println("Should that thermostat be so high?");
    }
}
