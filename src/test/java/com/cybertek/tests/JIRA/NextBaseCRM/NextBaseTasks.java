package com.cybertek.tests.JIRA.NextBaseCRM;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.NextBaseUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NextBaseTasks {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://login2.nextbasecrm.com/auth/?backurl=%2Fstream%2F");
        NextBaseUtilities.loginNextBase(driver);
    }

    @Test
    public void uploadIcon_files_images() {
        WebElement sendMessageBox = driver.findElement(By.xpath("//span[contains(text(),'Send message')]"));
        sendMessageBox.click();

        WebElement uploadFileIcon = driver.findElement(By.id("bx-b-uploadfile-blogPostForm"));
        uploadFileIcon.click();

        WebElement uploadFilesImagesIcon = driver.findElement(By.xpath("" +
                "//div[@class='feed-add-post-form-wrap']//div//td[@class='diskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main']"));
        BrowserUtils.wait(2);
        uploadFilesImagesIcon.click();

    }

    @Test //2-done
    public void uploadIcon_Bitrix24() {
        WebElement sendMessageBox = driver.findElement(By.xpath("//span[contains(text(),'Send message')]"));
        sendMessageBox.click();

        WebElement uploadFileIcon = driver.findElement(By.id("bx-b-uploadfile-blogPostForm"));
        uploadFileIcon.click();

        WebElement uploadFilesImagesIcon = driver.findElement(By.xpath("" + "//div[@class='feed-add-post-form-wrap']//tr[1]//td[3]"));
        BrowserUtils.wait(2);
        uploadFilesImagesIcon.click();
        WebElement selectThirdFolder = driver.findElement(By.xpath("//a[contains(text(),'2799831.jpg')]"));
        selectThirdFolder.click();
        WebElement acceptButton = driver.findElement(By.xpath("//span[@class='popup-window-button popup-window-button-accept']"));
        acceptButton.click();
    }

    @Test//3-done
    public void download_from_external_driver() {
        WebElement sendMessageBox = driver.findElement(By.xpath("//span[contains(text(),'Send message')]"));
        sendMessageBox.click();

        WebElement uploadFileIcon = driver.findElement(By.id("bx-b-uploadfile-blogPostForm"));
        uploadFileIcon.click();

        WebElement uploadFilesImagesIcon = driver.findElement(By.xpath("" +
                "//div[@class='feed-add-post-form-wrap']//div//span[@class='wd-fa-add-file-editor-link'][contains(text(),'Google Drive')]"));
        BrowserUtils.wait(2);
        uploadFilesImagesIcon.click();

        WebElement cancelButton = driver.findElement(By.xpath("//span[.='Cancel']"));
        BrowserUtils.wait(2);
        cancelButton.click();
    }

    @Test //4-done
    public void createUsing_Office365() {
        WebElement sendMessageBox = driver.findElement(By.xpath("//span[contains(text(),'Send message')]"));
        sendMessageBox.click();

        WebElement uploadFileIcon = driver.findElement(By.id("bx-b-uploadfile-blogPostForm"));
        uploadFileIcon.click();

        WebElement uploadFilesImagesIcon = driver.findElement(By.xpath("" +
                "//div[@class='feed-add-post-form-wrap']//div//span[@class='wd-fa-add-file-editor-link'][contains(text(),'Spreadsheet')]"));
        BrowserUtils.wait(2);
        uploadFilesImagesIcon.click();
    }

    @Test // 5-Done
    public void createQuote() {
        WebElement sendMessageBox = driver.findElement(By.xpath("//span[contains(text(),'Send message')]"));
        sendMessageBox.click();

        WebElement commaIcon = driver.findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']//i"));
        commaIcon.click();

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        driver.switchTo().frame(iframe);

        WebElement textBox = driver.findElement(By.xpath("//blockquote[@class='bxhtmled-quote']"));
        textBox.sendKeys("Test Completed");

        driver.switchTo().defaultContent();
        WebElement cancelButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-cancel']"));
        BrowserUtils.wait(3);
        cancelButton.click();

    }

    @AfterMethod
    public void tearDownMethod(){
        BrowserUtils.wait(2);
        driver.close();
    }

}
