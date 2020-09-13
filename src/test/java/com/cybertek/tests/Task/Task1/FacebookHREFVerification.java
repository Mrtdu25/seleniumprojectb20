package com.cybertek.tests.Task.Task1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHREFVerification {
    public static void main(String[] args) {
        /*
        TC #4: Facebook header verification
        1.Open Chrome browser
        2.Go to https://www.facebook.com
        3.Verify “Create a page” link
        href value contains text:
        Expected: “registration_form”
         */


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

        String expectedHREF="registration_form";
       String actualHREF= driver.findElement(By.linkText("Create a Page")).getAttribute("href");

       if (actualHREF.contains(expectedHREF)){
           System.out.println("Facebook Header-href verification PASSED!");
       }else {
           System.out.println("Facebook Header-href Verification FAILED!");
       }




    }
}
