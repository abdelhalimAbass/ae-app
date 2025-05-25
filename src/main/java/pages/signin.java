package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class signin {
    private WebDriver driver;

    public signin(WebDriver driver)
    {
        this.driver = driver;

    }

    private By txtusername = By.name("UserName");
    private By txtpassword= By.name("Password");
    private By btnlogin = By.cssSelector(".btn");
    public homepage performlogin(String name,String password){

        driver.findElement(txtusername).sendKeys(name);
        driver.findElement(txtpassword).sendKeys(password);
        driver.findElement(btnlogin).click();
        return new homepage(driver);
    }
}
