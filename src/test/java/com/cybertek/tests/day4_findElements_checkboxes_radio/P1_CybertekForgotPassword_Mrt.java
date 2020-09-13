package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_CybertekForgotPassword_Mrt {
    public static void main(String[] args) {
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
         WebElement home= driver.findElement(By.xpath("//a[@class='nav-link']"));

        //b. “Forgot password” header
       WebElement password= driver.findElement(By.xpath("//h2[contains(text(),'Forgot Password')]"));

        //c. “E-mail” text
        WebElement email=driver.findElement(By.xpath("//label[@for=\"email\"]"));

        //d. E-mail input box
        WebElement  emailInputBox=driver.findElement(By.xpath("//input[@name='email']"));

        //e. “Retrieve password” button
        WebElement retrievePassword=driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));

        //f. “Powered by Cybertek School” text
        WebElement poweredByCybertek=driver.findElement(By.xpath("//div[@style='text-align: center;']/.."));
        //4. Verify all WebElements are displayed.
        //.isDisplayed --> returns true if given web element is displayed
        //.isDisplayed --> returns flase if given web element is NOT displayed
        if (home.isDisplayed() && email.isDisplayed() && password.isDisplayed()
                && emailInputBox.isDisplayed() && retrievePassword.isDisplayed()
                && poweredByCybertek.isDisplayed()){
            System.out.println("ALL WEB ELEMENTS ARE DISPLAYED. VERIFICATION PASSED!");
        }else {
            System.out.println("One or more of the web elements are not displayed. Verification FAILED!!!");
        }
    }
}
