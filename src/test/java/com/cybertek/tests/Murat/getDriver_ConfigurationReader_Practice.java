package com.cybertek.tests.Murat;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class getDriver_ConfigurationReader_Practice {

    @Test
    public void searMusicOnYoutube(){
        String youtube = ConfigurationReader.getProperty("youtube");
        Driver.getDriver().get(youtube);

        String mySong = ConfigurationReader.getProperty("song");
        WebElement searchBox = Driver.getDriver().findElement(By.name("search_query"));
        searchBox.sendKeys(mySong+ Keys.ENTER);
        Driver.getDriver().findElement(By.partialLinkText("Teoman")).click();


    }

    @AfterMethod
    public void tearDownMethod(){
        BrowserUtils.wait(12);
        //Driver.closeDriver();
    }



}
