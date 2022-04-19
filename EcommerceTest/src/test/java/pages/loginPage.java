package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    WebDriver driver;
    public String email = "abcd@mail.com";
    public String pass = "123456";

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement LoginElement(){
        By Login = By.className("ico-login");
        return  driver.findElement(Login);
    }
    public WebElement EmailElement(){
        By Email = By.id("Email");
        return  driver.findElement(Email);
    }
    public WebElement PasswordElement(){
        By Password = By.id("Password");
        return  driver.findElement(Password);
    }
}
