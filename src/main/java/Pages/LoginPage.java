package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    protected   WebDriver driver;
    By LoginBtn = By.xpath("//*[@id=\"Signon\"]/form/div/div/button");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void ClickLoginBtn(){
        driver.findElement(LoginBtn).click();
    }


}
