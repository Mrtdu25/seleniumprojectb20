package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.SmartBearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class SmartBearPractice_9_10_11 extends TestBase {



    /*
    TC #9: SmartBear delete order
    1. Open browser and login to SmartBear
    2. Delete “Mark Smith” from the list
    3. Assert it is deleted from the list
     */
    @Test
    public void p9_delete_order_task() throws IOException {

        Properties properties=new Properties();
        FileInputStream file=new FileInputStream("Configurations.properties");
        properties.load(file);
        String smartbearUrl = properties.getProperty("smartbearUrl");
        ConfigurationReader.getProperty("smartbearUrl");


        driver.get(smartbearUrl);
        SmartBearUtilities.loginToSmartBear(driver);
        //Locate the checkbox for 'Mark Smith' and click to it
        BrowserUtils.wait(2);
        //WebElement markSmithCheckbox = driver.findElement(By.xpath("//td[.='Mark Smith']/preceding-sibling::td[1]"));
        //WebElement markSmithCheckbox = driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));
        WebElement markSmithCheckbox = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
        BrowserUtils.wait(3);
        markSmithCheckbox.click();
        BrowserUtils.wait(3);
        //Locate 'Delete Selected' button and click to it
        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();
        //Assert 'Mark Smith' is not in the table

        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        for (WebElement each : namesList) {
            Assert.assertFalse(each.getText().equals("Mark Smith"));
        }
    }
}
