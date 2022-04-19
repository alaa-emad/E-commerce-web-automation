package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPage {
    WebDriver driver;
    public String email = "abcd@mail.com";
    public String pass = "123456";
    public String first_name = "abcd";
    public String last_name = "efgh";

    public registerPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement registerElement(){
        By register = By.className("ico-register");
        WebElement registerElement = driver.findElement(register);
        return registerElement;
    }
    public WebElement FirstNameElement(){
        By FirstName = By.id("FirstName");
        WebElement FirstNameElement = driver.findElement(FirstName);
        return FirstNameElement;
    }
    public WebElement LastNameElement(){
        By LastName = By.id("LastName");
        WebElement LastNameElement = driver.findElement(LastName);
        return LastNameElement;
    }

    public WebElement EmailElement(){
        By Email = By.id("Email");
        WebElement EmailElement = driver.findElement(Email);
        return EmailElement;
    }
    public WebElement PasswordElement(){
        By Password = By.id("Password");
        WebElement PasswordElement = driver.findElement(Password);
        return PasswordElement;
    }

    public WebElement ConfirmPasswordElement(){
        By ConfirmPassword = By.id("ConfirmPassword");
        WebElement ConfirmPasswordElement = driver.findElement(ConfirmPassword);
        return ConfirmPasswordElement;
    }
    public WebElement registerButtonElement(){
        By registerButton = By.id("register-button");
        WebElement registerButtonElement = driver.findElement(registerButton);
        return registerButtonElement;
    }

    public By RegisterSuccessMsgElement() {
        return By.className("result");
    }

}
