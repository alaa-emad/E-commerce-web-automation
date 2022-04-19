package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.BrowserFactory;

public class SD9 extends BaseStep{
    WebDriver driver = GetDriver();
    mainPage element = new mainPage(driver);

    @Given("user click on add to shopping card icon")
    public void addToShoppingCart() throws InterruptedException {
        String BtnName = "Add to cart";
        driver.navigate().to("https://demo.nopcommerce.com/notebooks");
        element.SetPathElement("Asus N551JK-XO076H Laptop",BtnName).click();
        Thread.sleep(1000);
    }
    @Then("the item added to cart")
    public void selectToShoppingSuccess(){
        String expectedMsg = "shopping cart";
        String actualMsg = driver.findElement(By.xpath("//div[@class='bar-notification success']//a[contains(text(),'shopping cart')]")).getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));
    }

}
