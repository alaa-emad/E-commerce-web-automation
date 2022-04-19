package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.BrowserFactory;

public class SD1 extends BaseStep {
    WebDriver driver = GetDriver();
    registerPage element  =  new registerPage(driver);

    @Given("^the user is on the website page$")
    public void the_user_is_on_the_website_page() {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @Given("user navigates to register page")
    public void  openRegisterPage()  {
        element.registerElement().click();
    }
    @When("user enter valid data")
    public void enterValidData()
    {
        element.FirstNameElement().sendKeys(element.first_name);
        element.LastNameElement().sendKeys(element.last_name);
        element.EmailElement().sendKeys(element.email);
        element.PasswordElement().sendKeys(element.pass);
        element.ConfirmPasswordElement().sendKeys(element.pass);
    }
    @And("user click register button")
    public void clickRegister () throws InterruptedException {
        element.registerButtonElement().click();
        Thread.sleep(2000);
    }
    @Then("user registered successfully")
    public void success(){
        String expectedMsg = "Your registration completed";
        String actualMsg = driver.findElement(element.RegisterSuccessMsgElement()).getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));
    }

    @After
    public void closeBrowser() {
        BrowserFactory.CloseBrowser();
    }
}
