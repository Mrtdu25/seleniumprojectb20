package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice1_Mrt {
    public static void main(String[] args) throws InterruptedException{

      //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //3. Print out the texts of all links
        List<WebElement> linksForgotPasswordPage = driver.findElements(By.xpath("//body//a"));

        int linkWithoutText=0;
        int linkWithText=0;
        for (WebElement eachLink:linksForgotPasswordPage){
            String textEachLink= eachLink.getText();
            System.out.println(textEachLink);
            if (textEachLink.equals("")){
                linkWithoutText++;
            }else {
                linkWithText++;
            }
        }
        System.out.println("Number of link from the forgot password page: "+linksForgotPasswordPage.size());
        System.out.println("Number of link with text: "+linkWithText);
        System.out.println("Number of link with text: "+linkWithoutText);
        System.out.println(driver.getTitle());

        Thread.sleep(3000);
        driver.close();

    }
}
