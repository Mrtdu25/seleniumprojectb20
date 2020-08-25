package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMrt2 {
    public static void main(String[] args)throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://youtube.com");
        driver.navigate().back();
        driver.navigate().forward();

        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);


       // driver.findElement(By.linkText("Trending")).click();  // i need to give exact name
      //  driver.findElement(By.partialLinkText("brary")).click(); // you can give partial name

        // find by name
        driver.findElement(By.name("search_query")).sendKeys("Tan tasci - 5 dakika"+ Keys.ENTER);
        //driver.findElement(By.id("search")).sendKeys("Tan Tasci Ben Herbahar mutsuzum"+ Keys.ENTER);
       // driver.findElement(By.className("ytd-searchbox")).sendKeys("Sensiz olmaz"+ Keys.ENTER);

        driver.findElement(By.partialLinkText("Tan")).click();

        Thread.sleep(10000);
        driver.findElement(By.name("search_query")).clear();
        driver.findElement(By.name("search_query")).sendKeys("Tan tasci hata"+ Keys.ENTER);
        driver.findElement(By.partialLinkText("Tan")).click();
        Thread.sleep(10000);
        driver.navigate().back();
        driver.navigate().back();
        Thread.sleep(10000);
        driver.navigate().forward();
        driver.findElement(By.name("search_query")).clear();
        driver.findElement(By.name("search_query")).sendKeys("Bye Bye"+Keys.ENTER);
        driver.findElement(By.partialLinkText("ye")).click();
        driver.manage().window().getSize();
        Thread.sleep(6000);
        driver.close();








    }
}
