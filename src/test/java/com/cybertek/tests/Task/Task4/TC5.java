package com.cybertek.tests.Task.Task4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//TC #5: Selecting value from non-select dropdown

public class TC5 {
    WebDriver driver;
     @BeforeMethod
    public void setUpMethod(){
         //1. Open Chrome browser
         driver= WebDriverFactory.getDriver("chrome");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();


    }
       @Test
      public void selectFacebook_getTitle(){
           //2. Go to http://practice.cybertekschool.com/dropdown
           driver.get("http://practice.cybertekschool.com/dropdown");
          //3. Click to non-select dropdown
           WebElement dropdownMenuLink = driver.findElement(By.id("dropdownMenuLink"));
           dropdownMenuLink.click();
           //4. Select Facebook from dropdown
           WebElement facebook =driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[4]"));
           facebook.click();

           //5. Verify title is “Facebook - Log In or Sign Up”
           String actualTitle = driver.getTitle();
           String expectedTitle="Facebook - Log In or Sign Up";
           Assert.assertEquals(actualTitle,expectedTitle,"Test passed");


      }

      @AfterMethod
      public void tearDownMethod() throws InterruptedException{
          Thread.sleep(5000);
          driver.close();
      }






}
