package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class homepage {
    private  WebDriver driver;

    public homepage(WebDriver driver)
    {
        this.driver = driver;
    }
    //locator for login
    private By lnklogin = By.id("loginLink");
    //locator for employee list
    private By lnkemployee = By.linkText("Employee List");
  public signin clicklogin(){
      driver.findElement(lnklogin).click();
      return new signin(driver);
  }
public Employeelistpage clickemployeelist(){
      driver.findElement(lnkemployee).click();
      return new Employeelistpage(driver);
}
}



