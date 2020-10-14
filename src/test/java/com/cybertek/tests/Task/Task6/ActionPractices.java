package com.cybertek.tests.Task.Task6;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionPractices {
    @Test
    public void doubleClick() {
        //1. Go	to	https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //2. Switch	to	iframe.
        WebElement iframe = Driver.getDriver().findElement(By.id("iframeResult"));
        Driver.getDriver().switchTo().frame(iframe);
        //3. Double	click	on	the	text	“Double-click	me	to	change	my	text	color.”
        WebElement textDemoBox = Driver.getDriver().findElement(By.id("demo"));
        Actions actions=new Actions(Driver.getDriver());
        actions.doubleClick(textDemoBox).perform();

        //4. Assert:	Text’s	“style”	attribute	value	contains	“red”.
        String expected="red";
        String actual=textDemoBox.getAttribute("Style");

        Assert.assertTrue(actual.contains(expected),"Does not contains expected");

        Driver.getDriver().switchTo().defaultContent();

    }

    @Test
    public void homework(){
        //1. Go	to	https://the-internet.herokuapp.com/context_menu
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        //2. Right	click	to	the	box.
        WebElement hotBox = Driver.getDriver().findElement(By.id("hot-spot"));
        Actions actions=new Actions(Driver.getDriver());
        actions.contextClick(hotBox).perform();
        //3. Alert	will	open.
        //4. Accept	alert
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        //No	assertion	needed	for	this	practice.
    }

    @Test
    public void p3_drag_and_drop(){
        //1. Go	to	https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler")).click();
        //2. Drag	and	drop	the	small	circle	to	bigger	circle.
        WebElement draggable = Driver.getDriver().findElement(By.id("draggable"));
        WebElement droptarget = Driver.getDriver().findElement(By.id("droptarget"));
        BrowserUtils.wait(4);
        Actions actions =new Actions(Driver.getDriver());
        actions.dragAndDrop(draggable,droptarget).perform();
       // actions.clickAndHold(draggable).moveToElement(droptarget).release().perform(); //Alternative
        //3. Assert:
        //-Text	in	big	circle	changed to:	“You	did	great!”

        String expected="You did great!";
        String actual=droptarget.getText();
        //Driver.getDriver().findElement(By.xpath("//div[.='You did great!']")).getText();  alternative

        Assert.assertEquals(actual,expected,"Actual result does not equal to expected");
    }



}
