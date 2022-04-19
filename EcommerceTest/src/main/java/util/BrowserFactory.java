package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
    static WebDriver driver;

    //Open Browser
    public static WebDriver LaunchBrowser(){
        String chromePath = System.getProperty("user.dir") + "/src/main/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;

    }

    //Close Browser
    public static void CloseBrowser(){
        driver.quit();
    }

}
