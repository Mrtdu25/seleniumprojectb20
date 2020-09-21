package com.cybertek.tests.Task.Task4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

//select[@name'Languages']
public class TC4 {
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
    public void selectDropDown() throws InterruptedException {
        //3. Select all the options from multiple select dropdown.
        Select allOption=new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        Thread.sleep(3000);
        for (int i = 0; i <6 ; i++) {
            allOption.selectByIndex(i);
        }

        List<WebElement> allSelectedOptions = allOption.getAllSelectedOptions();
        for (WebElement eachSelection:allSelectedOptions){
            System.out.println(eachSelection.getText());
        }

        //5. Deselect all values.
        Thread.sleep(3000);
        allOption.deselectAll();

    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException{
            Thread.sleep(5000);
            driver.close();
    }





    }

