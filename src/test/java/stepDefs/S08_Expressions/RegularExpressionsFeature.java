package stepDefs.S08_Expressions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class RegularExpressionsFeature {

    @Given("I login as user (Piet|Klaas|Kees|Henk)$")
    public void iLoginAsUserX(String user) {
        System.err.println("I'm loggin in as user " + user);
    }

    @And("^I set my country code to ([A-Z][A-Z])$")
    public void iSetMyCountryCodeTo(String twoLetterCountryCode) {
        System.err.println("This user is from " + twoLetterCountryCode);
    }

    @And("^I change my cellphone number to (06[0-9]{8})$")
    public void iChangeMyCellphoneNumber(String phoneNr) {
        System.err.println("And the valid phone number is " +phoneNr);
    }
}
