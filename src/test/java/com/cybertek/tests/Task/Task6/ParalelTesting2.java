package com.cybertek.tests.Task.Task6;

import com.cybertek.utilities.DriverThreadLocal;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParalelTesting2 {

    @BeforeMethod
    public void setupMethod(){
        DriverThreadLocal.getDriver().manage().window().maximize();
        DriverThreadLocal.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test1(){
        DriverThreadLocal.getDriver().get("https://google.com");
    }

    @Test
    public void test2(){
        DriverThreadLocal.getDriver().get("https://amazon.com");
    }

    @Test
    public void test3(){
        DriverThreadLocal.getDriver().get("https://etsy.com");
    }

    @Test
    public void test4(){
        DriverThreadLocal.getDriver().get("https://apple.com");
    }

    public void tearDownMethod(){
        DriverThreadLocal.closeDriver();

    }



}
