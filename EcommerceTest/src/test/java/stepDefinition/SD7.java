package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import util.BrowserFactory;

public class SD7 extends BaseStep{
    WebDriver driver = GetDriver();
    mainPage element = new mainPage(driver);

    @Given("user select shoes item")
    public void selectShoes(){
        WebElement mainMenu = element.SelectCategoryElement("Apparel ");
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = element.SelectCategoryElement("Shoes ");
        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }
    @When("user click on red color")
    public void FilterByColor() throws InterruptedException {
        driver.findElement(By.id("attribute-option-15")).click();
    }
    @Then("shoes filtered by selected color")
    public void selectColorSuccess() throws InterruptedException {
        Thread.sleep(1000);
    }

}
