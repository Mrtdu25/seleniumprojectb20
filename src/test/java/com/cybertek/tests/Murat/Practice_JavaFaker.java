package com.cybertek.tests.Murat;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice_JavaFaker {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);
    }

    @Test
    public void task1_login_page_links_print_test(){
        //6. Print out count of all the links on landing page
        List<WebElement> allLinks = driver.findElements(By.xpath("//Body//a"));

        System.out.println("#of Links " + allLinks.size());
        //7. Print out each link text on this page
        int a=1;
        for (WebElement eachLink:allLinks){
            System.out.println(a+". Link Text: "+eachLink.getText());
            a++;
        }

    }

    @Test
    public void task2_create_order_with_javafaker() throws InterruptedException{
        //6. Click on Order
        WebElement orderLink = driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();

        //7. Select familyAlbum from product,
        Select productDropDown=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        productDropDown.selectByValue("FamilyAlbum");
        //set quantity to 2
        WebElement quantityInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantityInput.sendKeys(""+ Keys.BACK_SPACE+"2");
        //8. Click to “Calculate” button
        WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

        WebElement nameInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement streetInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement cityInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement stateInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zipInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        Faker faker=new Faker();
        nameInput.sendKeys(faker.name().fullName());
        streetInput.sendKeys(faker.address().streetName());
        cityInput.sendKeys(faker.address().city());
        stateInput.sendKeys(faker.address().state());
        zipInput.sendKeys(faker.address().zipCode().replaceAll("-",""));

        //click visa button & master
        WebElement visaButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaButton.click();
        Thread.sleep(1000);
        WebElement masterCardButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1"));
        masterCardButton.click();
        // Enter card number into the CardNr
        Thread.sleep(1000);
        WebElement cardNumberInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumberInput.sendKeys(faker.finance().creditCard().replaceAll("-",""));
        //Enter an expiration date
        Thread.sleep(1000);
        WebElement expireNrInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expireNrInput.sendKeys("19/05");
        // Click Red Process button
        Thread.sleep(1000);
        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();

        WebElement succesMessage = driver.findElement(By.xpath("//strong[contains(text(),'New order has been successfully added.')]"));
        Assert.assertTrue(succesMessage.isDisplayed());

    }
    @Test
    public void task3_checkAll_uncheckAll_logout(){

        WebElement viewAllOrdersLink = driver.findElement(By.xpath("//a[contains(text(),'View all orders')]"));
        viewAllOrdersLink.click();
        WebElement checkALl = driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
        checkALl.click();
        WebElement uncheckALl=driver.findElement(By.id("ctl00_MainContent_btnUncheckAll"));
        uncheckALl.click();
        WebElement logOutButton = driver.findElement(By.id("ctl00_logout"));
        logOutButton.click();
    }
    @AfterMethod
    public void tearDownMethod()throws InterruptedException{
        Thread.sleep(3000);
        driver.close();
    }




}
