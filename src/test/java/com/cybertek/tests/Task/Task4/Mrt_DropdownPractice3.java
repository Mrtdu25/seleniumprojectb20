package com.cybertek.tests.Task.Task4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Mrt_DropdownPractice3 {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void selectDays() throws InterruptedException {
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        Select selectDay=new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));

        for (int i=0;i <=7; i++){
            selectDay.selectByIndex(i);
        }

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }

}
