package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import util.BrowserFactory;

public class SD5 extends BaseStep{
    WebDriver driver = GetDriver();
    mainPage element  = new mainPage(driver);

    @Given("user click on currencies dropdown and select Euro")
    public void clickOnDropDown(){
        Select dropdown = new Select(element.SelectCurrencyElement());
        dropdown.selectByVisibleText("Euro");
    }

    @Then("the currency changed successfully")
    public void changeCurr() {
        String expectedMsg = "Euro";
        String actualMsg = driver.findElement(By.xpath("//div[@class='currency-selector']//select[@id='customerCurrency']//option[2][contains(text(),'Euro')]")).getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));

    }

}
