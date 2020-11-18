package com.cybertek.tests.day15_MrtDgrmnci_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_dataProvider2 {

    @Test(description = "verify page title",dataProvider = "testData")
    public void dataProvider(String url,String title){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get(url);

        Assert.assertTrue(driver.getTitle().contains(title));
        driver.quit();


    }


    @DataProvider(name = "testData")
    public Object[][] testData(){
        return new Object [][]{{"https://google.com","Google"},
                               {"https://facebook.com","Facebook"},
                               {"https://amazon.com","Amazon"},
                               {"https://etsy.com","Etsy"},


        };
    }


}
