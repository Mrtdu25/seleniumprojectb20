package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextBaseUtilities {
    //Login
    public static void loginNextBase(WebDriver driver){
        WebElement userEmail = driver.findElement(By.xpath("//input[@placeholder='Login']"));
        userEmail.sendKeys("helpdesk31@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("UserUser"+ Keys.ENTER);

    }




}
