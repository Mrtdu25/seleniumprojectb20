package com.cybertek.tests.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankLinkTextVerification {
    static WebDriver driver;

    public static void openChromeDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    public static void titleLinktext(String expectedTitle,String actualTitle){

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification PASSED!!");
        }else {
            System.out.println("Title verification FAILED!!");
            System.out.println("ExpectedTitle: "+expectedTitle);
            System.out.println("ActualTitle: "+actualTitle);
        }
    }

    public static void main(String[] args)throws InterruptedException {
        openChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.linkText("Zero Bank")).getAttribute("href");

        String expectedTitle="Zero Bank";
        String actualTitle=driver.getTitle();
        titleLinktext(expectedTitle,actualTitle);

        Thread.sleep(5000);
        driver.close();

    }
}
