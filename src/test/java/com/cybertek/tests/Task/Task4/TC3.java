package com.cybertek.tests.Task.Task4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC3 {
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
        public void selectDate() {
            //3. Select “December 1st, 1921” and verify it is selected.
            Select selectYear=new Select(driver.findElement(By.id("year")));
            //Select year using : visible text
            selectYear.selectByVisibleText("1921");

           Select selectMonth=new Select(driver.findElement(By.id("month")));
            //Select month using : value attribute
           selectMonth.selectByValue("11");

           Select selectDay=new Select(driver.findElement(By.id("day")));
           selectDay.selectByIndex(0);
            //Select day using : index number
            String expectedYear="1921";
            String expectedMonth="December";
            String expectedDay="1";

            String actualYear=selectYear.getFirstSelectedOption().getText();
            String actualMonth=selectMonth.getFirstSelectedOption().getText();
            String actualDay=selectDay.getFirstSelectedOption().getText();

            Assert.assertEquals(actualYear,expectedYear);
            Assert.assertTrue(actualMonth.equals(expectedMonth));
            Assert.assertEquals(actualDay,expectedDay);


        }

        @AfterMethod
        public void tearDownMethod() throws InterruptedException{
            Thread.sleep(5000);
            driver.close();
        }
}

