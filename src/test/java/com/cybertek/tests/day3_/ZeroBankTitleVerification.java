package com.cybertek.tests.day3_;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTitleVerification {
    static WebDriver driver;

    public static void openChrome(){
        //TC #1: Zero Bank title verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public static void titleVerification(String expectedTitle,String actualTitle){

        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification Failed");
            System.out.println("Expected title: " + expectedTitle);
            System.out.println("Actual title: " + actualTitle);
        }


    }

    public static void main(String[] args) {

        openChrome();
        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedTitle="Zero - Log in";
        String actualTitle=driver.getTitle();
        titleVerification(expectedTitle,actualTitle);

        driver.close();





    }


}
