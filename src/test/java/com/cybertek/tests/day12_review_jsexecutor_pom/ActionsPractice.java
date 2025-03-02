package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractice {
    /*
      TC #16: Double Click Test
      1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
      2. Switch to iframe.
      3. Double click on the text “Double-click me to change my text color.”
      4. Assert: Text’s “style” attribute value contains “red”.
       */
    @Test
    public void p2_double_click_test(){

        //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        // 2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");

        //3. Double click on the text “Double-click me to change my text color.”
        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));

        //Creating actions instance to be able to use methods that come with it
        Actions actions = new Actions(Driver.getDriver());

        //Using actions instance, and doubleClick method to doubleCLick
        actions.doubleClick(textToDoubleClick).perform();

        //4. Assert: Text’s “style” attribute value contains “red”.
        String expected = "red";
        String actual = textToDoubleClick.getAttribute("style"); //color: red;

        Assert.assertTrue(actual.contains(expected));

    }

    @Test
    public void p3_drag_and_drop(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Driver.getDriver().manage().window().maximize();

        //2. Drag and drop the small circle to bigger circle.
        BrowserUtils.wait(3);
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();
        //Locating circles
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        BrowserUtils.wait(3);

        Actions actions = new Actions(Driver.getDriver());
        //DragAndDrop method expects to arguments:
        // #1-Which webElement you want to drag : SOURCE
        // #2-Where do you want to drop it? : TARGET
        actions.dragAndDrop(smallCircle, bigCircle).perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great
        String expected = "You did great!";
        String actual = bigCircle.getText();

        Assert.assertTrue(actual.equals(expected));



        BrowserUtils.wait(10);
        Driver.closeDriver();
    }

    @Test
    public void p3_drag_and_drop_LONGERWAY(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Driver.getDriver().manage().window().maximize();

        //2. Drag and drop the small circle to bigger circle.
        BrowserUtils.wait(3);
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();
        //Locating circles
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        BrowserUtils.wait(3);

        Actions actions = new Actions(Driver.getDriver());
        //DragAndDrop method expects to arguments:
        // #1-Which webElement you want to drag : SOURCE
        // #2-Where do you want to drop it? : TARGET
        //actions.dragAndDrop(smallCircle, bigCircle).perform();

        //actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();
        actions.clickAndHold(smallCircle).perform();
        BrowserUtils.wait(3);

        actions.moveToElement(bigCircle).perform();
        BrowserUtils.wait(3);

        actions.release().perform();




        //3. Assert:
        //-Text in big circle changed to: “You did great
        String expected = "You did great!";
        String actual = bigCircle.getText();

        Assert.assertTrue(actual.equals(expected));



        BrowserUtils.wait(10);
        Driver.closeDriver();
    }

    @Test
    public void p4_context_click_test(){
        //TC #17: Context Click – HOMEWORK
        //1. Go to https://the-internet.herokuapp.com/context_menu
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        Driver.getDriver().manage().window().maximize();
        //2. Right click to the box.

        //locating the box
        WebElement box = Driver.getDriver().findElement(By.id("hot-spot"));

        //to be able to right click, we need to create actions instance
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.wait(2);
        //using "context click" method to right click on the box
        actions.contextClick(box).perform();


        //3. Alert will open. Switch to alert
        Alert alert = Driver.getDriver().switchTo().alert();

        //4. Accept alert
        BrowserUtils.wait(2);
        alert.accept();

        //No assertion needed for this practice.
    }
}
