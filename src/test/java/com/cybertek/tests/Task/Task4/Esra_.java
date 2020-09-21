package com.cybertek.tests.Task.Task4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Esra_ {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='prependedInput']") ).sendKeys("User181");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(1000);
        WebElement activities= driver.findElement(By.xpath("//a//span[contains(text(),'Activities')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(activities).perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Calendar Events")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
