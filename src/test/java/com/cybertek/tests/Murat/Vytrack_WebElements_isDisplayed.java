package com.cybertek.tests.Murat;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Vytrack_WebElements_isDisplayed {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();

        // find the Login element
        WebElement loginLinkText=driver.findElement(By.xpath("//h2[@class='title']"));

        //find usernameBox
        WebElement userNameBox=driver.findElement(By.cssSelector(".span2"));

        //find passwordBox

        WebElement passwordBox=driver.findElement(By.xpath("//input[@id=\"prependedInput2\"]"));

        //Remember me on this computer
        WebElement rememberMeLinkText=driver.findElement(By.xpath("//span[@class='custom-checkbox__text']"));

        //Forgot your password?
        WebElement forgotYourPasswordLT=driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));

        WebElement loginButton=driver.findElement(By.xpath("//button[@id='_submit']"));

        //Manage Link Text

        WebElement manageLinkText=driver.findElement(By.xpath("//img[@class='bitnami-corner-image']"));


        // is Displayed

        if (loginLinkText.isDisplayed()&&userNameBox.isDisplayed()&&passwordBox.isDisplayed()&&
        rememberMeLinkText.isDisplayed()&&forgotYourPasswordLT.isDisplayed()&&loginButton.isDisplayed()
                &&manageLinkText.isDisplayed()){
            System.out.println("All WebElements displayed VERIFICATION PASSED");
        }else {
            System.out.println("All WebElements NOT displayed VERIFICATION FAILED!!");
        }

      // driver.manage().timeouts().implicitlyWait(15,10.22);



    }
}
