package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Employeelistpage {
    private WebDriver driver;

    public Employeelistpage(WebDriver driver) {
        this.driver = driver;
    }
    //create new
    private By create_new= By.xpath("/html/body/div[2]/form/a");
   public Employeelistpage click_create_new (){
       driver.findElement(create_new).click();
       return new Employeelistpage(driver);
   }
}