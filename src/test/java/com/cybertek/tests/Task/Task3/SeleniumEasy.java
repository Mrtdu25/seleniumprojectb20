package com.cybertek.tests.Task.Task3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumEasy {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        WebElement checkAllButton = driver.findElement(By.xpath("//input[@id='check1']"));

        if (driver.findElement(By.xpath("//input[@value=\"Check All\"]")).getAttribute("value").equals("Check All")){
            System.out.println("Button text is 'Check All',Verification PASSED!");
        }else {
            System.out.println("Button text is NOT 'Check All',Verification FAILED!!!");
        }
        System.out.println(checkAllButton.getText());
        Thread.sleep(2500);
        checkAllButton.click();

      /*  WebElement checkbox1 = driver.findElement(By.xpath("//label[text()='Option 1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//label[text()='Option 2']"));
        WebElement checkbox3 = driver.findElement(By.xpath("//label[text()='Option 3']"));
        WebElement checkbox4 = driver.findElement(By.xpath("//label[text()='Option 4']"));

    //5. Verify all    check  boxes  are    checked
        if (checkbox1.isSelected() && checkbox2.isSelected() && checkbox3.isSelected() && checkbox4.isSelected()){
            System.out.println("All check boxes are selected, Verification PASSED!");
        }else {
            System.out.println("All check boxes are NOT selected, Verification Failed!!");
        }*/

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
              byte j=1;
         for (WebElement eachCheckBox:checkBoxes){
             if (eachCheckBox.isSelected()){
                 System.out.println("Option "+j+" check box is selected, Verification PASSED!");
                 j++;
             }else {
                 System.out.println("Option "+j+" check box is selected, Verification Failed!!");
             }
         }


        // 6.Verify   button text   changed    to "Uncheck All"
        if (driver.findElement(By.xpath("//input[@value=\"Uncheck All\"]")).getAttribute("value").equals("Uncheck All")){
            System.out.println("Button text is 'Uncheck All', Verification PASSED!");
        }else {
            System.out.println("Button text is NOT 'Uncheck All', Verification FAILED!!!");
        }


        Thread.sleep(5000);
        driver.close();

    }
}
