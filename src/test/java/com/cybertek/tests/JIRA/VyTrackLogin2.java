package com.cybertek.tests.JIRA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrackLogin2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://youtube.com");
        driver.findElement(By.name("search_query")).sendKeys("Tan-zora sarildik 2020"+ Keys.ENTER);






    }

}
