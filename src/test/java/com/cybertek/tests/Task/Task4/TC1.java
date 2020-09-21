package com.cybertek.tests.Task.Task4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1 {
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
    public void simpleDropdown(){
         //3. Verify “Simple dropdown” default selected value is correct
         //Expected: “Please select an option”
        WebElement simpleDropdown = driver.findElement(By.xpath("//option[contains(text(),'Please select an option')]"));
        String actualResultSimpleDropdown = simpleDropdown.getText();
        String expectedResultSimpleDropdown="Please select an option";

        Assert.assertTrue(actualResultSimpleDropdown.equals(expectedResultSimpleDropdown));
    }

    @Test
    public void stateSelection(){
        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        WebElement stateSelection = driver.findElement(By.xpath("//option[contains(text(),'Select a State')]"));
        String actualValueStateSelection = stateSelection.getText();
        String expectedValueStateSelection="Select a State";

        Assert.assertTrue(actualValueStateSelection.equals(expectedValueStateSelection));

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException{
       Thread.sleep(5000);
       driver.close();
    }

}
