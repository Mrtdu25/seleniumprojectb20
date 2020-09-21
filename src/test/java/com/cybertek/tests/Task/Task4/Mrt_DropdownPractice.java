package com.cybertek.tests.Task.Task4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Mrt_DropdownPractice {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void selectDays() throws InterruptedException{
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        Select selectList=new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
                                                                ////option[contains(text(),'Please select')]
        selectList.selectByIndex(1);
        Thread.sleep(2500);
        selectList.selectByIndex(2);
        Thread.sleep(2500);
        selectList.selectByIndex(3);
        Thread.sleep(2500);
        selectList.selectByIndex(4);
        Thread.sleep(2500);
        selectList.selectByIndex(5);
        Thread.sleep(2500);
        selectList.selectByIndex(6);
        Thread.sleep(2500);
        selectList.selectByIndex(7);
        Thread.sleep(2500);
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }


}
