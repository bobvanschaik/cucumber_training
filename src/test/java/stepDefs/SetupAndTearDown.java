package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetupAndTearDown {

    @Before
    public void setup() {
        System.out.println("Starting");
    }

    @After
    public void tearDown() {
        System.out.println("Closing");
    }
}
