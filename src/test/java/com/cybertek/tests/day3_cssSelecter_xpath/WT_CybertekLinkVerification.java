package com.cybertek.tests.day3_cssSelecter_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_CybertekLinkVerification {
    public static void main(String[] args)throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");


        //driver.findElement(By.name("email")).sendKeys("ccvvvoljsdrtwaslwl@domain.com");
        WebElement emailInputBox=driver.findElement(By.name("email"));
        emailInputBox.sendKeys("ccvvvoljsdrtwaslwl@domain.com");

        Thread.sleep(4000);
        //driver.findElement(By.id("form_submit")).click();
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click(); //

        String expectedURL="email_sent";
        String actualURL=driver.getCurrentUrl();
        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!!");
        }else {
            System.out.println("URL verification FAILED!!");
        }
         // verify the text
        WebElement confirmationMessage=driver.findElement(By.name("confirmation_message"));

        String actualText = confirmationMessage.getText();
        String expectedText="Your e-mail's been sent!";

        if (actualText.equals(expectedText)){
            System.out.println("Header text value verification PASSED!!");
        }else {
            System.out.println("Header text value verification FAILED!!");
        }

        System.out.println("actualText = " + actualText);
        System.out.println("expectedText = " + expectedText);

        //Verify if the web element is displayed or not
        if (confirmationMessage.isDisplayed()){
            System.out.println("Confirmation message is displayed. Verification PASSED!!");
        }else {
            System.out.println("Confirmation message is NOT displayed. Verification FAILED!!");
        }



        Thread.sleep(7000);
        driver.close();







    }
}
