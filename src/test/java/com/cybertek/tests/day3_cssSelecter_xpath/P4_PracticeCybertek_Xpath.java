package com.cybertek.tests.day3_cssSelecter_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_PracticeCybertek_Xpath {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2=driver.findElement(By.xpath("//button[@name='button2']"));
        button2.click();
        //<button class="btn btn-primary" onclick="button2()" name="button2">Button 2</button>
        //  //button[@name='button2']
        //  //button[@name ='button2']


    }
}
