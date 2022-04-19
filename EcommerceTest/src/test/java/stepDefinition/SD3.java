package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.*;
az

public class SD3  extends BaseStep{
    WebDriver driver = GetDriver();
    resetPasswordPage element = new resetPasswordPage(driver);

    @Given("user logout and navigates to login page")
    public void logoutAndNavigate() {
        element.LoginElement().click();
    }
    @When("user click on reset button")
    public void reset(){
        element.ForgotPasswordElement().click();
    }
    @And("user enter correct email and lick enter")
    public void enterEmail() throws InterruptedException {
        element.EmailElement().sendKeys(element.email);
        element.EmailElement().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    @Then("password rest link sent successfully")
    public void resetSuccess(){
        String expectedMsg = "Email with instructions has been sent to you.";
        String actualMsg = driver.findElement(element.successMsgElement()).getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));
    }

}
