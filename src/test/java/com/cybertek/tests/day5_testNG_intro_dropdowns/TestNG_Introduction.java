package com.cybertek.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;


public class TestNG_Introduction {

    @BeforeClass
    public void setUpClass(){
        System.out.println("Before class is running...");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("After class is running...");
    }
    @BeforeMethod   // BeforeMethod runs before each test
    public void setUpMethod(){
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
    }
    @Test
    public void test1(){
        System.out.println("Test 1 is running....");
    }

    @Test // Test
    public void test2(){
        System.out.println("Test 2 is running....");
    }
    @Test //AssertTrue method
    public void test3(){
       String str1="TestNG";
       String str2="TestNG";
       String str3="Test";

        Assert.assertTrue(str1.equals(str2)); //AssertTrue method

        Assert.assertTrue(str1.equals(str3) , "Str1 is not equal to Str3.");

        Assert.assertEquals(str1,str2, "Failure message we put it ");
    }


}
