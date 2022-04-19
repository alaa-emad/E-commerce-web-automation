package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage {
    WebDriver driver;
    public mainPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement SearchBoxElement(){
        By searchBox = By.id("small-searchterms");
        return driver.findElement(searchBox);
    }

    public WebElement SelectCurrencyElement(){
        By dropdown = By.id("customerCurrency");
        return driver.findElement(dropdown);
    }

    public WebElement SelectCategoryElement(String category){
        By SelectCategory = By.xpath("//a[contains(text(),'" + category +"')]");
        return  driver.findElement(SelectCategory);
    }
    public WebElement SetPathElement(String device,String button){
        By path = By.xpath("//h2[@class='product-title']//* [contains(text(),'"+device +"')]//following::div[@class='add-info']//div[2]/button[text()='"+button+"']");
        return driver.findElement(path);
    }
}
