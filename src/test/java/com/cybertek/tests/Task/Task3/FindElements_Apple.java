package com.cybertek.tests.Task.Task3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElements_Apple {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        //3. Click to iPhone

        WebElement iphoneModule=driver.findElement(By.xpath("//a[@href='/iphone/']"));
        iphoneModule.click();
        //4. Print out the texts of all links

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        int linksWithoutText = 0;
        int linksWithText = 0;

        for (WebElement eachLink:listOfLinks){
            String textOfEachLink=eachLink.getText();
            System.out.println(textOfEachLink);

            if (textOfEachLink.equals("")){
                linksWithoutText++;
            }else {
                linksWithText++;
            }


        }
        //5. Print out how many link is missing text
        System.out.println("The number of links that does not have text= " + linksWithoutText);

        //6. Print out how many link has text
        System.out.println("The number of links that HAS text = " + linksWithText);
        //7. Print out how many total link
        System.out.println("The number of TOTAL links on this page =  " + listOfLinks.size());
    }

}
