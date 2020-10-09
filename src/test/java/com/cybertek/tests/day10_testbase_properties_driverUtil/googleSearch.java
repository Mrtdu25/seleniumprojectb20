package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Drivermrt;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class googleSearch {


    @Test
    public void searchSomething(){

        Drivermrt.getDriver().get("https://google.com");

        WebElement searchBox = Drivermrt.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

    }


}
