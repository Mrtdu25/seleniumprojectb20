package com.cybertek.tests.Task.Task4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC2 {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        //1. Open Chrome browser
        driver= WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        //wait 15 second implicitly
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //Maximize the page
        driver.manage().window().maximize();
    }
       @Test
    public void selectIllinois(){
          //3. Select Illinois
           WebElement illinois = driver.findElement(By.xpath("//option[@value='IL']"));
           illinois.click();
    }

    public void selectVirginia(){
        WebElement virginia=driver.findElement(By.xpath("//option[@value='VA']"));
        virginia.click();
    }

    public void selectCalifornia(){
        WebElement selectCalifornia=driver.findElement(By.xpath("//option[@value='CA']"));
        selectCalifornia.click();
    }






        @Test
    public void selectState() throws InterruptedException{
            //3. Select Illinois
            Select stateSelection=new Select(driver.findElement(By.id("state")));
            stateSelection.selectByVisibleText("Illinois");
            //4. Select Virginia
            Thread.sleep(3000);
            stateSelection.selectByValue("VA");
            //5. Select California
            Thread.sleep(3000);
            stateSelection.selectByIndex(5);
            //Use all Select options. (visible text, value, index)

            String expected = "California";
            String actual = stateSelection.getFirstSelectedOption().getText();
            Assert.assertEquals(expected,actual);
        }

      @ AfterMethod
       public void tearDownMethod() throws InterruptedException{
           Thread.sleep(3000);
           driver.close();
       }


}
