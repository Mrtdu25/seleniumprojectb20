package com.cybertek.tests.day3_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeaderVerification2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");
        String actualHREF=driver.findElement(By.linkText("Create a Page")).getAttribute("value");
        String  expectedInHREF="registration_form";

        if (actualHREF.equals(expectedInHREF)){
            System.out.println("Header verification PASSED!!");
        }else {
            System.out.println("Header verification FAILED!!");
        }



    }
}
