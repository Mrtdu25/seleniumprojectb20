package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args)throws InterruptedException {

        //TC #2: Cybertek verifications
        //1. Open Chrome browser
        //I need to setup my browser driver.
        WebDriverManager.chromedriver().setup();

        //To create instance of chrome browser from WebDriver.
        WebDriver driver = new ChromeDriver();

        // this line will maximize the newly opened browser page
        driver.manage().window().maximize();

        //2. Go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");
        //3. Verify URL contains
        String actualUrl=driver.getCurrentUrl();
        String expextedUrl="cybertekschool";
        //Expected: cybertekschool

        if (actualUrl.contains(expextedUrl)){
            System.out.println("URL Verification is Passed");
        }else {
            System.out.println("URL Verification is Failed");
        }


        String actualTitle=driver.getTitle();
        String expectedTitle="Practice";
        //4. Verify title:
        //Expected: Practice

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed");
        }else {
            System.out.println("Title verification Failed");
        }

        driver.findElement(By.linkText("Autocomplete")).click();

        Thread.sleep(30000);
        driver.close();



    }
}
