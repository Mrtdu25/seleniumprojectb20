package com.cybertek.tests.day3_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeaderVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

        String actualText =driver.findElement(By.tagName("h2")).getText();
        String expectedText="Connect with friends and the world around you on Facebook.";

        if (actualText.equals(expectedText)){
            System.out.println("Header verification PASSED!");
        }else {
            System.out.println("Header verification FAILED!!!");
        }



    }
}
