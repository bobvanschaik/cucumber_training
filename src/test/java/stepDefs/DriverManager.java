package stepDefs;

import framework.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager{
    public static WebDriver driver;

//    @Before
//    public static void setupClass(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
//
//    @After
//    public static void terminateClass(){
//        driver.quit();
//    }
}
