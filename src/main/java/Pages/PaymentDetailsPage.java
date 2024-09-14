package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PaymentDetailsPage {
    protected   WebDriver driver;
    By ContinueBtn = By.xpath("//*[@id=\"CenterForm\"]/form/div/button[1]");
    public PaymentDetailsPage(WebDriver driver){
        this.driver=driver;
    }
    public void ClickContinueBtn(){
        driver.findElement(ContinueBtn).click();
    }


}
