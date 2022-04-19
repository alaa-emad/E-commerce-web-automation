package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import util.BrowserFactory;

public class SD12  extends BaseStep{
    WebDriver driver = GetDriver();
    mainPage element = new mainPage(driver);
    loginPage loginElement = new loginPage(driver);

    @Given("user login with valid data")
    public void log_in() {
        loginElement.LoginElement().click();
        loginElement.EmailElement().sendKeys(loginElement.email);
        loginElement.PasswordElement().sendKeys(loginElement.pass);
        loginElement.PasswordElement().sendKeys(Keys.ENTER);
    }
    @And("user add item to cart")
    public void add_to_cart(){
        String BtnName = "Add to cart";
        driver.navigate().to("https://demo.nopcommerce.com/notebooks");
        element.SetPathElement("Asus N551JK-XO076H Laptop",BtnName).click();
        driver.findElement(By.className("ico-cart")).click();
    }
    @When("user press continue and complete the process")
    public void completeOrder() throws InterruptedException {

        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();

        Select dropdown = new Select(driver.findElement(By.name("BillingNewAddress.CountryId")));
        dropdown.selectByVisibleText("Egypt");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Cairo");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("any address");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("11595");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("123456789");
        driver.findElement(By.name("save")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("shippingoption_1")).click();
        driver.findElement(By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("paymentmethod_0")).click();

        driver.findElement(By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]")).click();
        Thread.sleep(2000);
    }
    @Then("order completed successfully")
    public void confirmOrder() throws InterruptedException {
        String expectedMsg = "Your order has been successfully processed!";
        String actualMsg = driver.findElement(By.className("title")).getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));
        Thread.sleep(2000);
    }
}
