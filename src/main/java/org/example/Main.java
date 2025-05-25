package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.create_employee_page;
import pages.homepage;

import java.util.concurrent.TimeUnit;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://eaapp.somee.com");
        homepage Homepage=new homepage(driver);
        System.out.println("i am here1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       var signin =Homepage.clicklogin();
        System.out.println("i am here2");
        signin.performlogin("admin","password");
        System.out.println("i am here");
        var create_new =Homepage.clickemployeelist();
        var create_new_employee =create_new.click_create_new();
        create_employee_page create_em=new create_employee_page (driver);
        create_em.createNewEmployee("autouser2","222222","autouser2@exampel.com","10000","middle");
        //employee list clicking
       // pages.signin.signinfun(driver);
       // pages.Registerpage.register(driver);



            //driver.findElement(By.id("ConfirmPassword")).sendKeys("P@ssw0rd");








      }
    }
