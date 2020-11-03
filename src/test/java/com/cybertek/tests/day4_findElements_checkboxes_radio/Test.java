package com.cybertek.tests.day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();



        List<WebElement> linkList = driver.findElements(By.xpath("//body//a"));

        System.out.println(linkList.size());

        for (WebElement each : linkList) {
            if (each.getText().equals("")){
                continue;
            }else {
                System.out.println(each.getText());
            }

        }


       WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
        checkbox1.click();

        System.out.println(checkbox1.isDisplayed());

        System.out.println(checkbox1.isSelected());

        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
        checkbox2.click();

        System.out.println(checkbox2.isDisplayed());

        System.out.println(checkbox2.isEnabled());




    }









}
