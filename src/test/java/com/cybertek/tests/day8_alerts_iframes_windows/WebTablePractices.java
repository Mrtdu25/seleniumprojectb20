package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTablePractices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);
    }


    //Using the verify order method from SmartBearUtilities class
    @Test
    public void task4_verify_order(){

        SmartBearUtilities.verifyOrder(driver, "Mark Smith");
        //SmartBearUtilities.verifyOrder(driver, "Mark Smiths");

    }

    //Using the printNamesAndCities method to print all names and their cities
    @Test
    public void task5_print_names_and_cities(){

        SmartBearUtilities.printNameAndCities(driver);

    }

    @Test
    public void task6_print_cities_zipcodes_states(){
        SmartBearUtilities.printCitiesZipCodes_States(driver);
    }

    @Test
    public void task7_Verify_Zipcode(){
        SmartBearUtilities.verifyZipCode(driver,"76743");
    }

    @Test
    public void task8_CreditCards(){
        SmartBearUtilities.cardNumbers(driver);
    }

    @Test
    public void task9_Verify_CreditCardNumber() {
        SmartBearUtilities.verifyCreditNumber(driver,"770077007700");

    }
    @AfterMethod
    public void tearDownMethod(){
        BrowserUtils.wait(2);
        driver.close();
    }

}
