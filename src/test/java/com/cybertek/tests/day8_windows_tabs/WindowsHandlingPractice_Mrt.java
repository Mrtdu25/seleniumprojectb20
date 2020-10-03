package com.cybertek.tests.day8_windows_tabs;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsHandlingPractice_Mrt {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");

    }

    @Test
    public void p1_handling_more_than_two_windows(){
        driver.get("https://amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://instagram.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://youtube.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current Page Title: "+driver.getTitle());

            if (driver.getCurrentUrl().contains("tube")){
                Assert.assertTrue(driver.getTitle().contains("YouTube"));
                break;
            }
        }
                
    }
}
