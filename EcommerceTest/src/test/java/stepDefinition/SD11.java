package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.BrowserFactory;

public class SD11  extends BaseStep {
    WebDriver driver = GetDriver();
    mainPage element = new mainPage(driver);

    @Given("user click on compare list icon for item")
    public void addToCompareList() throws InterruptedException {
        String BtnName = "Add to compare list";
        driver.navigate().to("https://demo.nopcommerce.com/notebooks");
        element.SetPathElement("Asus N551JK-XO076H Laptop",BtnName).click();
        Thread.sleep(1000);
    }
    @Then("item added to compare list")
    public void selectToComparelistSuccess() throws InterruptedException {
        Thread.sleep(500);
    }
}
