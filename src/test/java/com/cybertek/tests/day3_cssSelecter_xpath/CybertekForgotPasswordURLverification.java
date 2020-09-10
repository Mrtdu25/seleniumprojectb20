package com.cybertek.tests.day3_cssSelecter_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekForgotPasswordURLverification {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("degirmenci_mrt@yahoo.com");
        Thread.sleep(4000);
        driver.findElement(By.id("form_submit")).click();

        Thread.sleep(7000);
        driver.close();



    }
}
