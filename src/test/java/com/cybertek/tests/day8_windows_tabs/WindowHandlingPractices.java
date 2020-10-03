package com.cybertek.tests.day8_windows_tabs;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandlingPractices {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");

    }

    @Test
    public void p5_Handling_Windows(){
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.equals("Practice"));
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        String titleAfterClick=driver.getTitle();
        System.out.println("titleAfterClick = " + titleAfterClick);

        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("mainWindowHandle = " + mainWindowHandle);

        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current title ="+driver.getTitle());
        }

        driver.switchTo().window(mainWindowHandle);

    }

    @Test
    public void p6_handling_more_than_two_windows(){

        driver.get("https://amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current page title "+driver.getTitle());

            if (driver.getCurrentUrl().contains("etsy")){
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }

        }



    }

}
