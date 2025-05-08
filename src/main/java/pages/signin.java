package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class signin {
    public static void signinfun(WebDriver driver)
    {
        driver.findElement(By.id("loginLink")).click();
        driver.findElement(By.id("UserName")).sendKeys("pepsii");
        driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
        driver.findElement(By.id("loginIn")).click();


    }
}
