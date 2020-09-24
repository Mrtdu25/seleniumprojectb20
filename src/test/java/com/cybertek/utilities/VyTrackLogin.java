package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrackLogin {

    public static void vyTrackDriverLogin(WebDriver driver){

        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("user181");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123"+ Keys.ENTER);
    }

}
