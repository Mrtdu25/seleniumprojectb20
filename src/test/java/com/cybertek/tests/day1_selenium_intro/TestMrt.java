package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMrt {
    public static void main(String[] args)throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver mrt=new ChromeDriver();
        mrt.manage().window().maximize();

        mrt.get("https://www.adidas.com");

        String actualTitle=mrt.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        String currentUrl=mrt.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        Thread.sleep(2000);

        mrt.navigate().back();
        Thread.sleep(2000);
        mrt.navigate().forward();

        Thread.sleep(2000);
        mrt.navigate().to("https://www.robinhood.com");

        mrt.navigate().refresh();

        Thread.sleep(10000);
        mrt.quit();





    }
}
