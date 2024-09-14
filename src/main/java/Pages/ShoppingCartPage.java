package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShoppingCartPage {
    protected   WebDriver driver;
By ProccedToCheckOutBtn = By.xpath("//*[@id=\"Cart\"]/a");
public ShoppingCartPage(WebDriver driver){
    this.driver=driver;
}
    public void ClickProccedToCheckOutBtn(){
        driver.findElement(ProccedToCheckOutBtn).click();
    }


}
