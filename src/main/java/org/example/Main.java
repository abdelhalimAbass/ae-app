package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://eaapp.somee.com");
        //employee list clicking
       // pages.signin.signinfun(driver);
        pages.Registerpage.register(driver);



            //driver.findElement(By.id("ConfirmPassword")).sendKeys("P@ssw0rd");








      }
    }
