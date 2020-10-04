package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
//iter for each loop & fori for loop
public class SmartBearUtilities {
    //1
    public static void loginToSmartBear(WebDriver driver){
        //3. Enter username: “Tester”

        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }

    //2
    public static void verifyOrder(WebDriver driver,String name){

        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        for (WebElement each : namesList) {
            if (each.getText().equals(name)){
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.fail(name+" does not exist in the list Test FAILED!!");
    }

    //3
    public static void printNameAndCities(WebDriver driver){
        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));

        for (int i = 0; i <namesList.size() ; i++) {
            System.out.println("Name"+ (i+1) +": " + namesList.get(i).getText() + ", City"+ (i+1) +": " + citiesList.get(i).getText());
        }
    }

    //4
    public static void printCitiesZipCodes_States(WebDriver driver){
        List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));
        List<WebElement> stateList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[8]"));
        List<WebElement> zipCodesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[9]"));

        for (int i = 0; i <citiesList.size() ; i++) {
            System.out.println((i+1)+".City: "+citiesList.get(i).getText()+" Zip Code: "+zipCodesList.get(i).getText()+
                    " State: " +stateList.get(i).getText());
        }

    }

    //5
    public static void verifyZipCode(WebDriver driver,String zipcode){
        List<WebElement> zipCodesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[9]"));

        for (WebElement eachZipCode : zipCodesList) {
            if (eachZipCode.getText().equals(zipcode)){
                Assert.assertTrue(true);
                return;
            }
        }

        Assert.fail(zipcode+"does not exist in the list Test FAILED!!");

    }

    //6
    public static void cardNumbers(WebDriver driver){
        List<WebElement> cardNumbers = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[11]"));
         int i=1;
        for (WebElement eachCardNumber : cardNumbers) {
            System.out.println(i+". CardNumber: "+eachCardNumber);
            i++;
        }

    }

    //
    public static void verifyCreditNumber(WebDriver driver,String cardNumber){
        List<WebElement> cardNumbers = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[11]"));
        for (WebElement eachCardNumber : cardNumbers) {
            if (eachCardNumber.getText().equals(cardNumber)){
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.fail(cardNumber+"does not exist in the list Test FAILED!!");

    }


    public static void removeName(WebDriver driver,String name){

        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

           namesList.removeIf(each ->each.equals(name));
    }






    }



