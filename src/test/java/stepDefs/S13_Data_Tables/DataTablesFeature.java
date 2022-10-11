package stepDefs.S13_Data_Tables;

import framework.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.Products;
import stepDefs.DriverManager;

import java.util.List;

public class DataTablesFeature {

    private WebDriver driver;
    HomePage homePage;

    public DataTablesFeature(DriverManager driverManager){
        this.driver = driverManager.driver;
        homePage = new HomePage(driver);
    }

    @Given("I open the {string} page")
    public void iOpenThePage(String page) {
        HomePage homePage = new HomePage(driver);
        homePage.clickAllProducts();
    }

    @When("I add these products to my shopping cart:")
    public void iAddTheseProductsToMyShoppingCart(List<String> shoppingItems) {
        Products product = new Products(driver);
        for (String s : shoppingItems) {
            product.openProduct(s).addProductToCart().continueShopping().goBack();
        }
    }
}
