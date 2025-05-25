package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createemployeepage {
    private WebDriver driver;
    //private Object UIElementExtentions;

    public createemployeepage(WebDriver driver) {
        this.driver = driver;
    }
    //locator name
    private By txtname = By.id("Name");
    //duration in work
    private By txtsalary=By.id("Salary");
     //salary
    private By duration_in_work=By.id("DurationWorked");
    //grade
    private By txtgrade =By.id("Grade");
    private By txtemail=By.id("Email");
    private By btncreate =By.cssSelector(".btn");

   //public create
    public Employeelistpage createNewEmployee(String name,String duration,String email,String salary,String grade)
    {
        driver.findElement(txtname).sendKeys(name);
        driver.findElement(txtemail).sendKeys(email);
        driver.findElement(txtsalary).sendKeys(salary);
        driver.findElement(txtgrade).sendKeys(grade);
        driver.findElement(duration_in_work).sendKeys(duration);
        driver.findElement(btncreate).click();
        return new Employeelistpage(driver);


    }

}
