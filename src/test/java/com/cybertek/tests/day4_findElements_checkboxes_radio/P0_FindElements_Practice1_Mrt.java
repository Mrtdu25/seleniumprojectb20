package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P0_FindElements_Practice1_Mrt {
    public static void main(String[] args) throws InterruptedException{

      //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //3. Print out the texts of all links
        List<WebElement> listOfLinks= driver.findElements(By.xpath("//body//a"));

        for (WebElement eachLink:listOfLinks){
            System.out.println(eachLink.getText());
        }

        //4. Print out how many total link
        System.out.println("NumberOfLinks = " + listOfLinks.size());

        Thread.sleep(5000);
        driver.close();



    }
}
