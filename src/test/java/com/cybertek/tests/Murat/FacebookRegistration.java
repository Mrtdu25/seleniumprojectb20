package com.cybertek.tests.Murat;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookRegistration {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://instagram.com");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("mrtdua");

        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("123456789");

        WebElement logIn=driver.findElement(By.xpath("//div[contains(text(),'Log In')]"));
        logIn.click();

        Thread.sleep(4000);
        //driver.close();


        //div[@id='h5']/div/span























    }
}

