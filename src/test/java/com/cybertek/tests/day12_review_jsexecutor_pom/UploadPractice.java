package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void uploadFiles(){

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        Driver.getDriver().manage().window().maximize();
        WebElement fileUpload=Driver.getDriver().findElement(By.id("file-upload"));
        String path="C:/Users/Murat/Desktop/gs.png";
        BrowserUtils.wait(3);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();
    }

    @Test
    public void uploadfiles2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        Driver.getDriver().manage().window().maximize();
        WebElement choseFile = Driver.getDriver().findElement(By.id("file-upload"));
        String path="C:/Users/Murat/Desktop/gs.png";
        choseFile.sendKeys(path);

        BrowserUtils.wait(2);
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();
    }

}
