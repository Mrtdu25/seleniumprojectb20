package com.cybertek.tests.Task.Task5;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearDeleteOrder {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);
        //1. Open browser and login to SmartBear
    }

    @Test   //SmartBear delete order
    public void tc9_smartBearDeleteOrder() {
        //2. Delete “Mark Smith” from the list
        WebElement markSmithCheckBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl03_OrderSelector']"));
        markSmithCheckBox.click();
        //3. Assert it is deleted from the list
        WebElement deleteSelectedButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteSelectedButton.click();

        List<WebElement> tableNames = driver.findElements(By.xpath("//table[@class='SampleTable']//tr//td[2]"));

        for (WebElement eachName : tableNames) {
            Assert.assertNotEquals(eachName.getText(), "Mark Smith");
        }
    }

    @Test  //SmartBear edit order
    public void tc10_SmartBearEditOrder(){
        //Click to edit button from the right for “Steve Johns”
        WebElement editButton = driver.findElement(By.xpath("//table[@class='SampleTable']//tr[4]//td[13]"));
        editButton.click();

        WebElement nameBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        nameBox.clear();
        //3. Change name to “Michael Jordan”
        nameBox.sendKeys("Michael Jordan");
        //4. Click Update
        WebElement updateButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton"));
        updateButton.click();
        //5. Assert “Michael Jordan” is in the list
        SmartBearUtilities.verifyOrder(driver,"Michael Jordan");
    }

    @Test  //Create a method called removeName()
    public void tc11_removeNameTest(){

        SmartBearUtilities.removeName(driver,"Susan McLaren");
    }
    @AfterMethod
    public void tearDownMethod(){
        BrowserUtils.wait(2);
        driver.close();
    }




}




