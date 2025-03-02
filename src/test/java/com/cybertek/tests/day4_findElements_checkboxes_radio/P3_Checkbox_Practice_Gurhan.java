package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Checkbox_Practice_Gurhan {
    public static void main(String[] args) throws InterruptedException {
        //Practice: Cybertek Checkboxes
        //1. Go to http://practice.cybertekschool.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        //Locating the first checkbox
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        //Locating the second checkbox
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        //2. Confirm checkbox #1 is NOT selected by default
        if (!checkbox1.isSelected()){
            System.out.println("Checkbox 1 is not selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 1 is selected. Verification FAILED!!!");
        }

        //3. Confirm checkbox #2 is SELECTED by default.
        if (checkbox2.isSelected()){
            System.out.println("Checkbox 2 is selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 2 is not selected. Verification FAILED!!!");
        }

        //4. Click checkbox #1 to select it.
        Thread.sleep(1000);
        checkbox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(1000);
        checkbox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        if (checkbox1.isSelected()){
            System.out.println("Checkbox 1 is selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 1 NOT is selected. Verification FAILED!!!");
        }

        //7. Confirm checkbox #2 is NOT selected.
        if (!checkbox2.isSelected()){
            System.out.println("Checkbox 2 NOT is selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 2 is selected. Verification FAILED!!!");
        }

        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));

        //homeLink.click();

        //Thread.sleep(1000);

        ///driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().refresh();

        checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        checkbox1.click();



    }
}
