package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FishPage {
    protected   WebDriver driver;
    By TigerSharkLink = By.linkText("FI-SW-02");

    public FishPage(WebDriver driver){
        this.driver=driver;
    }
    public void ClickTigerSharkProductID(){
        driver.findElement(TigerSharkLink).click();
    }
}
