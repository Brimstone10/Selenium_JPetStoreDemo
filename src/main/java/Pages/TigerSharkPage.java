package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
public class TigerSharkPage {
    protected WebDriver driver;
    By AddtoCartBtn = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a");
    public TigerSharkPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickAddtoCartBtn() {
        driver.findElement(AddtoCartBtn).click();
    }
    public void scrollToMiddleExcludingHeaderFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Long pageHeight = (Long) js.executeScript("return document.body.scrollHeight");
        Long headerFooterHeight = 200L;
        Long scrollTo = (pageHeight / 2) - headerFooterHeight;
        js.executeScript("window.scrollTo(0, " + scrollTo + ")");
    }
    public void takeScreenshot(String fileName) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destDir = new File("screenshots");
        File destFile = new File(destDir, fileName + ".png");
        if (!destDir.exists()) {
            destDir.mkdir();
        }
        try {
            FileHandler.copy(srcFile, destFile);
            System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
