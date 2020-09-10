package com.cybertek.tests.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_title_verification {
    public static void main(String[] args) {
        //TC #1: Facebook title verification
        // 1.Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        String actualTitle= driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);


        String expectedTitle=driver.getTitle();
        System.out.println("expectedTitle = " + expectedTitle);




        // 3.Verify title: Expected: “Facebook -Log In or Sign Up”





    }
}
