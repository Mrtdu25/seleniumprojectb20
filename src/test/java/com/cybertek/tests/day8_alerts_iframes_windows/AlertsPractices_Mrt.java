package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices_Mrt {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void p1_information_alert_practice(){
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        warningAlertButton.click();

        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(2);
        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed());
    }

    @Test
    public void p2_confirmation_alert_practice(){
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        warningAlertButton.click();

        Alert alert=driver.switchTo().alert();
        alert.dismiss();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println("resultText.getText() = " + resultText.getText());
        Assert.assertTrue(resultText.isDisplayed());
    }

    @Test
    public void p3_Prompt_Alert_Practice(){
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        warningAlertButton.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("I still can not belive we will have 4 days offff");
        BrowserUtils.wait(2);
        alert.accept();
    }

    @AfterMethod
    public void tearDownMethod(){
        BrowserUtils.wait(2);
        driver.close();
    }



}
