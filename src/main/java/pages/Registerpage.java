package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerpage {
    public static void register (WebDriver driver)
    {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul[1]/li[3]/a")).click();
        // click on register button
        driver.findElement(By.id("registerLink")).click();
        // entreing name in register page
        driver. findElement(By.id("UserName")).sendKeys("pepsi");
        //entring password
        driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
        // entring password cofirmation
        driver.findElement(By.id("ConfirmPassword")).sendKeys("yyyyy");
        //entring email
        driver.findElement(By.id("Email")).sendKeys("example@email.com");
        driver.findElement(By.cssSelector(".btn")).click();
        try  {
            WebElement message=driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/ul/li[2]"));
            if(message.isDisplayed()) {
                System.out.println("message appear");
                driver.findElement(By.id("ConfirmPassword")).clear();
                driver.findElement(By.id("ConfirmPassword")).sendKeys("P@ssw0rd");
                driver. findElement(By.id("UserName")).clear();
                driver. findElement(By.id("UserName")).sendKeys("pepsii");
                driver.findElement(By.cssSelector(".btn")).click();
            }
        }catch (Exception e)
        {
            {
                System.out.println("message not appear");
            }
        }
//        try{WebElement as= driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/ul/li[1]"));
//            if(as.isDisplayed()){
//                System.out.println("this exist message appear");
//            }
//        }
//        catch (Exception e)
//        {
//            System.out.println("this exist message not appear");
//        }
        try {
            Alert alert=driver.switchTo().alert();
            String alerttext=alert.getText();
            if(alerttext.contains("Name pepsii is already taken."))
            {
                System.out.println("الرسالة ظهرت");
            }
        } catch (Exception e){
            System.out.println("الرسالة لم تظهر");
        }



    }
}
