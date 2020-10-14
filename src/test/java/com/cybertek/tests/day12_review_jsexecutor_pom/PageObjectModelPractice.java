package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class PageObjectModelPractice {

    @Test
    public void loginSmartBear(){
        LoginPage loginPage=new LoginPage();
        //getURL
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        loginPage.usernameInput.sendKeys("Tester");
        loginPage.passwordInput.sendKeys("test");
        loginPage.loginButton.click();

    }
}
