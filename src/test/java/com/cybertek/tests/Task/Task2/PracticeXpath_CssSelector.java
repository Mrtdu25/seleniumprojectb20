package com.cybertek.tests.Task.Task2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeXpath_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
      //3. Click to “Add Element” button
        driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
      //4. Verify “Delete” button is displayed after clicking.

        WebElement confirmationMessage=driver.findElement(By.xpath("//button[@class='added-manually']"));
        String actualText=confirmationMessage.getText();
        String expectedText="Delete";

        if (actualText.equals(expectedText)){
            System.out.println("Text verification PASSED!!");
        }else {
            System.out.println("Text verification FAILED!!");
        }

     // 5. Click to “Delete” button.
        Thread.sleep(5000);
        confirmationMessage.click();


      // 6. Verify “Delete” button is NOT displayed after clicking.

        if (confirmationMessage.isDisplayed()){
            System.out.println("Confirmation message is displayed. Verification PASSED!!");
        }else {
            System.out.println("Confirmation message is NOT displayed. Verification FAILED!!");
        }

    }
}
