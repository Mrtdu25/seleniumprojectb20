package com.cybertek.tests.JIRA.VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VyTrackLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.name("_username")).sendKeys("user181");
        driver.findElement(By.name("_password")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(3000);
        WebElement fleet= driver.findElement(By.className("unclickable"));
        Actions actions=new Actions(driver);
        actions.moveToElement(fleet).perform();
        driver.findElement(By.linkText("Vehicles")).click();
        Thread.sleep(5000);


       // driver.close();

      //span[@class='title title-level-1'][contains(text(),'Fleet')]





    }
}
