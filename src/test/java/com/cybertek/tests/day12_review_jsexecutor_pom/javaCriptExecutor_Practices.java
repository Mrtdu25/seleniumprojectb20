package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class javaCriptExecutor_Practices {

    @Test
    public void scroll_using_jsexecutor_1(){
        //Get the page to scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //Create instance of JSExecutor and cast our driver type to it.
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //use execute script method


        for (int i = 0; i < 10 ; i++) {
            BrowserUtils.wait(i);
            js.executeScript("window.scrollBy(0, 500)");

        }

    }

    @Test
    public void scroll_using_jsexecutor_2(){

        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        WebElement link = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homelink = Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        BrowserUtils.wait(2);
        js.executeScript("arguments[0].scrollIntoView(true)",link);
        BrowserUtils.wait(2);
        js.executeScript("arguments[0].scrollIntoView(true)",homelink);

    }



}
