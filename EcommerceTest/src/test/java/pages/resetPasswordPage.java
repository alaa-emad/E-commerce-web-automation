package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class resetPasswordPage {
    WebDriver driver;
    public String email = "abcd@mail.com";

    public resetPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement LoginElement(){
        By Login = By.className("ico-login");
        WebElement LoginElement = driver.findElement(Login);
        return LoginElement;
    }
    public WebElement EmailElement(){
        By Email = By.id("Email");
        WebElement EmailElement = driver.findElement(Email);
        return EmailElement;
    }
    public WebElement ForgotPasswordElement(){
        By ForgotPassword = By.linkText("Forgot password?");
        WebElement ForgotPasswordElement = driver.findElement(ForgotPassword);
        return ForgotPasswordElement;
    }

    public By successMsgElement(){
        return By.className("content");
    }
}
