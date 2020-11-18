package com.cybertek.tests.day15_MrtDgrmnci_practice;

import com.cybertek.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ResizePage {

    @Test
    public void resizeThePage(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://google.com");

        BrowserUtils.wait(3);
        Dimension dimension=new Dimension(480,620);

        driver.manage().window().setSize(dimension);

        BrowserUtils.wait(4);







    }







}
