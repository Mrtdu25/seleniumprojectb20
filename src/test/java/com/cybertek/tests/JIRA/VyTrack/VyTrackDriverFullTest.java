package com.cybertek.tests.JIRA.VyTrack;

import com.cybertek.utilities.VyTrackLogin;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTrackDriverFullTest {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        VyTrackLogin.vyTrackDriverLogin(driver);
    }
    @Test
    public void fleet_Module(){
        WebElement fleetModule = driver.findElement(By.xpath("//a[@class='unclickable']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(fleetModule).perform();
        driver.findElement(By.linkText("Vehicles")).click();
    }
}
