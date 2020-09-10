package com.cybertek.tests.day3_cssSelecter_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_AmazonCssSelector {
    public static void main(String[] args) {

        //TC #3: Amazon link number verification 1. Open Chrome browser
        WebDriver driver=WebDriverFactory.getDriver("chrome");

        // 2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");
        // 3. Enter search term (use cssSelectorto locate search box)

        //input[id="twotabsearchtextbox"]
        //input#twotabsearchtextbox

        WebElement searchBox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        //WebElement searchBox=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        searchBox.sendKeys("Wooden Spoon"+ Keys.ENTER);
        // 4. Verify title contains search term



    }
}
