package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.BrowserFactory;

public class SD10 extends BaseStep{
    WebDriver driver = GetDriver();
    mainPage element = new mainPage(driver);

    @Given("user click on wishlist icon for item")
    public void addToWishList(){
        String BtnName = "Add to wishlist";
        driver.navigate().to("https://demo.nopcommerce.com/notebooks");
        element.SetPathElement("Asus N551JK-XO076H Laptop",BtnName).click();
    }
    @Then("item added to wishlist")
    public void selectToWishlistSuccess() throws InterruptedException {
        Thread.sleep(500);
    }
}
