package com.cybertek.tests.day3_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIncorrectLoginTitleVerification {
    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        driver.findElement(By.name("email")).sendKeys("Dgrmnci@gmail.com");

        driver.findElement(By.id("pass")).sendKeys("123456"+ Keys.ENTER);


        String expectedTitle="Log into Facebook | Facebook";
        String actualTitle=driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification PASSED!!");
        }else {
            System.out.println("Title verification FAILED!!");
        }

        Thread.sleep(5000);
        driver.close();


    }
}
