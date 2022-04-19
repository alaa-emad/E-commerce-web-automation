package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.BrowserFactory;

public class SD4 extends BaseStep{
    WebDriver driver = GetDriver();
    mainPage element = new mainPage(driver);

    @Given("user click on search box and enter the name of product then enter")
    public void clickOnSearchBox(){
        element.SearchBoxElement().sendKeys("apple macbook pro 13-inch");
        element.SearchBoxElement().sendKeys(Keys.ENTER);
    }
    @Then("the process success")
    public void success(){
        String expectedMsg = "Apple MacBook Pro 13-inch";
        String actualMsg = driver.findElement(By.xpath("//a[contains(text(),\"Apple MacBook Pro 13-inch\")]")).getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));
    }

}
