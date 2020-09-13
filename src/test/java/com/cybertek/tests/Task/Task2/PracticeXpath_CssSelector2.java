package com.cybertek.tests.Task.Task2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeXpath_CssSelector2 {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get(" http://practice.cybertekschool.com/forgot_password");

        //a. “Home” link
        driver.findElement(By.xpath("//a[@class='nav-link']")).getText();
        //body:nth-child(2) nav.navbar.navbar-expand-sm.bg-light ul.navbar-nav li.nav-item > a.nav-link
        //b. “Forgot password” header
        driver.findElements(By.xpath("//h2[contains(text(),'Forgot Password')]"));
        //c. “E-mail” text
        driver.findElements(By.xpath("//label[contains(text(),'E-mail')]"));
        //d. E-mail input box
        driver.findElements(By.xpath("//input[@name='email']"));
        //e. “Retrieve password” button
        driver.findElements(By.xpath("//button[@id='form_submit']"));
        //f. “Powered by Cybertek School” text
        driver.findElement(By.xpath("//div[contains(text(),'Powered by')]")).getText();
        //4. Verify all WebElements are displayed.


    }
}
