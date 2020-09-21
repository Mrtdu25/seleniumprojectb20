package com.cybertek.tests.Task.Task3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Uros {
    public static void main(String[] args) throws InterruptedException{
        //  WebDriverManager.chromedriver().setup();
        // WebDriver driver=new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/");
        Thread.sleep(2000);
        // driver.findElement(By.id("prependedInput")).sendKeys("user181");
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("user181");
        Thread.sleep(2000);
        //   driver.findElement(By.name("_password")).sendKeys("UserUser123"+ Keys.ENTER);
        WebElement password = driver.findElement(By.name("_password"));
        password.sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(2000);
        WebElement fleet= driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(fleet).perform();
        driver.findElement(By.partialLinkText("Costs")).click();

        WebElement createVehicleCost = driver.findElement(By.xpath("//div[@id='container']//div//div//div//div//a[contains(text(),'Create Vehicle Costs')]"));
        createVehicleCost.click();

        //a[


    }
}
