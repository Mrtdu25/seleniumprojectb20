package com.cybertek.tests.JIRA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrackLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.name("_username")).sendKeys("user181");
        driver.findElement(By.name("_password")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(3000);
        driver.get("https://qa2.vytrack.com/entity/Extend_Entity_Carreservation");
        Thread.sleep(5000);
        driver.close();






    }
}
