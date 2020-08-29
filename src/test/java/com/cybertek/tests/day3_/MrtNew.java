package com.cybertek.tests.day3_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MrtNew {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        driver.findElement(By.name("search_query")).sendKeys("Yillarin cilesi belli yuzude"+ Keys.ENTER);
        driver.findElement(By.partialLinkText("Küskünüm")).click();




    }
}
