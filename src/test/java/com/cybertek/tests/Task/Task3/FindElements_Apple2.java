package com.cybertek.tests.Task.Task3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElements_Apple2 {
    public static void main(String[] args) {
       //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");
        //3. Click to all of the headers one by one
        //a. Mac, iPad, iPhone, Watch, TV, Music, Support
        WebElement macLink=driver.findElement(By.xpath("//a[@href='/mac/']"));
        macLink.click();
        WebElement ipadLink=driver.findElement(By.xpath("//a[@href='/ipad/']"));
        ipadLink.click();
        WebElement iphoneLink=driver.findElement(By.xpath("//a[@href='/iphone/']"));
        iphoneLink.click();
        WebElement watchLink=driver.findElement(By.xpath("//a[@href='/watch/']"));
        watchLink.click();
        WebElement tvLink=driver.findElement(By.xpath("//a[@href='/tv/']"));
        tvLink.click();
        WebElement musicLink=driver.findElement(By.xpath("//a[@href='/music/']"));
        musicLink.click();
        WebElement supportLink=driver.findElement(By.xpath("//a[@class=\"ac-gn-link ac-gn-link-support\"]"));
        supportLink.click();

        //4. Print out how many links on each page with the titles of the pages

        //5. Loop through all

        //6. Print out how many link is missing text TOTAL

        //7. Print out how many link has text TOTAL

        //8. Print out how many total link TOTAL



    }
}
