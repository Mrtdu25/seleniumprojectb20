package com.cybertek.tests.day7_WebTableTasks;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearLogin {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtilities.loginToSmartBear(driver);
    }

    @Test
    public void p3_verify_susans_order_date(){
      WebElement susansDate= driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));
        System.out.println(" Susan's Date " + susansDate.getText());

        String expectedDate="01/05/2010";
        String actualDate=susansDate.getText();

        Assert.assertEquals(actualDate,expectedDate,"Actual date not equal to expected date");

    }
    @AfterMethod
    public void tearDownMethod()throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }
}
