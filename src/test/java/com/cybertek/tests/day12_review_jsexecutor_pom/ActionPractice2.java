package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionPractice2 {

    @Test
    public void doubleClick(){
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        WebElement iframeResult = Driver.getDriver().findElement(By.id("iframeResult"));
        Driver.getDriver().switchTo().frame(iframeResult);

        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));
        Actions actions=new Actions(Driver.getDriver());
        actions.doubleClick(textToDoubleClick).perform();

        String expected="red";
        String actual=textToDoubleClick.getAttribute("style");

        Assert.assertTrue(actual.contains(expected));

        BrowserUtils.wait(5);
        Driver.closeDriver();
    }

    @Test
    public void drag_and_drop(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement cookies = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();

        BrowserUtils.wait(3);
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCircle).perform();

        String actual = bigCircle.getText();
        String expected="You did great!";

        Assert.assertEquals(actual,expected,"Actual does not equal to expected");

        BrowserUtils.wait(3);
        Driver.closeDriver();
    }

    @Test
    public void p3_drag_and_drop_LONGERWAY(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement cookies = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();

        BrowserUtils.wait(3);
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions=new Actions(Driver.getDriver());
        actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();

        String actual = bigCircle.getText();
        String expected="You did great!";

        Assert.assertEquals(actual,expected,"Actual result does not equal to expected");

        BrowserUtils.wait(3);
        Driver.closeDriver();


    }


    @Test
    public void p4_context_click_test(){
        //1. Go to https://the-internet.herokuapp.com/context_menu
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        WebElement boxLink = Driver.getDriver().findElement(By.xpath("//div[@id='hot-spot']"));

        Actions actions =new Actions(Driver.getDriver());
        actions.contextClick(boxLink).perform();

        Alert alert = Driver.getDriver().switchTo().alert();

        BrowserUtils.wait(2);
        alert.accept();

        BrowserUtils.wait(2);
        Driver.closeDriver();




    }









}
