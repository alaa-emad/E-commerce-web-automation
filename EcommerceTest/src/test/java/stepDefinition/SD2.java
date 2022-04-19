package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.BrowserFactory;

public class SD2 extends BaseStep{

    WebDriver driver = GetDriver();
    loginPage element = new loginPage(driver);

    @Given("user navigates to login page")
    public void navigateToLoginPage(){
        element.LoginElement().click();
    }
    @When("user enter valid email and password")
    public void enterValidUserNameAndPassword (){
        element.EmailElement().sendKeys(element.email);
        element.PasswordElement().sendKeys(element.pass);
    }
    @And("user click enter")
    public void clickEnter(){
        element.PasswordElement().sendKeys(Keys.ENTER);
    }
    @Then("user logged successfully")
    public void loginSuccess() throws InterruptedException {
        Thread.sleep(1000);
        String expectedMsg = "Log out";
        String actualMsg = driver.findElement(By.linkText("Log out")).getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));
    }

}
