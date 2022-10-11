package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class SetupAndTearDown {

    @BeforeAll
    public static void setup() {
        System.out.println("Starting");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Closing");
    }
}
