package com.cybertek.tests.JIRA;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VyTrackOdometer_TruckDriver {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement userName=driver.findElement(By.cssSelector("input[id=\"prependedInput\"]"));
        userName.sendKeys("user181 ");
        Thread.sleep(3000);

        WebElement password=driver.findElement(By.xpath("//input[@name='_password']"));
        password.sendKeys("UserUser123"+ Keys.ENTER);

        WebElement fleet= driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(fleet).perform();
        driver.findElement(By.partialLinkText("Odometer")).click();
        Thread.sleep(5000);


    }
}
