package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HomePage {
    protected   WebDriver driver;
    By FishLink= By.linkText("Fish");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public FishPage ClickFishLink(){
        driver.findElement(FishLink).click();
        return new FishPage(driver);
    }
}
