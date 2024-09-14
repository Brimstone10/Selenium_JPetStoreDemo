package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class ConfirmOrderPage {
    protected   WebDriver driver;
    By ConfirmBtn = By.xpath("//*[@id=\"CenterForm\"]/form/div/button[1]");
    public ConfirmOrderPage(WebDriver driver){
        this.driver=driver;
    }
    public void ClickConfirmBtn(){
        driver.findElement(ConfirmBtn).click();
    }
    public void scrollToMiddleExcludingHeaderFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Get the total page height using JavaScript
        Long pageHeight = (Long) js.executeScript("return document.body.scrollHeight");

        // Assume a header and footer height of 200px (adjust based on your actual page layout)
        Long headerFooterHeight = 200L;

        // Scroll to the middle of the page, excluding the header and footer
        Long scrollTo = (pageHeight / 2) - headerFooterHeight;
        js.executeScript("window.scrollTo(0, " + scrollTo + ")");
    }
    public void takeScreenshot(String fileName) {
        // Convert WebDriver to TakesScreenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        // Capture the screenshot and store it as a file
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        // Specify the destination folder and filename
        File destDir = new File("screenshots");
        File destFile = new File(destDir, fileName + ".png");

        // Check if the directory exists; if not, create it
        if (!destDir.exists()) {
            destDir.mkdir();
        }

        try {
            // Copy the screenshot to the desired location
            FileHandler.copy(srcFile, destFile);
            System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
