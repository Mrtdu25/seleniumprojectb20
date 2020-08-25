package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("Apple"+ Keys.ENTER);
        driver.findElement(By.partialLinkText("ges")).click();

        String expectedTitle="apple - Google Search";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Google title verification PASSED!");
        }else {
            System.out.println("Google title verification FAILED!!!");
        }

    }
}
