package com.cybertek.tests.Task.Task3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElements_Apple2 {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        //1. Open Chrome browser
        driver= WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
      @Test
      public void macPageTitle_LinkTexts(){
           //3. Click to all of the headers one by one
           //a. Mac, iPad, iPhone, Watch, TV, Music, Support
           WebElement macLink=driver.findElement(By.xpath("//a[@href='/mac/']"));
           macLink.click();
           List<WebElement> linksMacPage = driver.findElements(By.xpath("//body//a"));
           int linkWithText=0;
           int linkWithoutText=0;

           for (WebElement eachLink:linksMacPage){
               String textEachLinkMacPage=eachLink.getText();
               System.out.println(textEachLinkMacPage);

               if (textEachLinkMacPage.equals("")){
                   linkWithoutText++;
               }else {
                   linkWithText++;
               }
           }
           System.out.println("Title of Mac page: "+driver.getTitle());
           System.out.println("Number of links on mac page: "+linksMacPage.size());
           System.out.println("Number of link without text: "+linkWithoutText);
           System.out.println("Number of link with text: "+linkWithText);

       }
      @Test
      public void ipadPageTitle_LinkTexts(){
        WebElement ipadLink=driver.findElement(By.xpath("//a[@href='/ipad/']"));
        ipadLink.click();
        List<WebElement> linksIpadPage = driver.findElements(By.xpath("//body//a"));
        int linkWithoutText=0;
        int linkWithText=0;
        for (WebElement eachLink:linksIpadPage){
            String textEachLinkIpadPage=eachLink.getText();
            System.out.println(textEachLinkIpadPage);
            if (textEachLinkIpadPage.equals("")){
                linkWithoutText++;
            }else {
                linkWithText++;
            }
        }
        System.out.println("Title of Ipad page: "+driver.getTitle());
        System.out.println("Number of links on Ipad page: "+linksIpadPage.size());
        System.out.println("Number of link without text: "+linkWithoutText);
        System.out.println("Number of link with text: "+linkWithText);
    }
      @Test
      public void iphonePageTitle_LinkTexts(){
          WebElement iphoneLink=driver.findElement(By.xpath("//a[@href='/iphone/']"));
          iphoneLink.click();
          List<WebElement> linksIphonePage = driver.findElements(By.xpath("//body//a"));
          int linkWithoutText=0;
          int linkWithText=0;
          for (WebElement eachLink:linksIphonePage){
              String textEachLinkIphonePage=eachLink.getText();
              System.out.println(textEachLinkIphonePage);
              if (textEachLinkIphonePage.equals("")){
                  linkWithoutText++;
              }else {
                  linkWithText++;
              }
          }
          System.out.println("Title of Iphone page: "+driver.getTitle());
          System.out.println("Number of links on Iphone page: "+linksIphonePage.size());
          System.out.println("Number of link without text: "+linkWithoutText);
          System.out.println("Number of link with text: "+linkWithText);
      }
      @Test
      public void watchPageTitle_LinkTexts(){
          WebElement watchLink=driver.findElement(By.xpath("//a[@href='/watch/']"));
          watchLink.click();
          List<WebElement> linksWatchPage = driver.findElements(By.xpath("//body//a"));
          int linkWithoutText=0;
          int linkWithText=0;
          for (WebElement eachLink:linksWatchPage){
              String textEachLinkWatchPage=eachLink.getText();
              System.out.println(textEachLinkWatchPage);
              if (textEachLinkWatchPage.equals("")){
                  linkWithoutText++;
              }else {
                  linkWithText++;
              }
          }
          System.out.println("Title of Watch page: "+driver.getTitle());
          System.out.println("Number of links on Watch page: "+linksWatchPage.size());
          System.out.println("Number of link without text: "+linkWithoutText);
          System.out.println("Number of link with text: "+linkWithText);
      }
      @Test
      public void TVPageTitle_LinkTexts(){
            WebElement tvLink=driver.findElement(By.xpath("//a[@href='/tv/']"));
            tvLink.click();
            List<WebElement> linksTVpage = driver.findElements(By.xpath("//body//a"));
            int linkWithoutText=0;
            int linkWithText=0;
            for (WebElement eachLink:linksTVpage){
                String textEachLinkTvPage=eachLink.getText();
                if (textEachLinkTvPage.equals("")){
                    linkWithoutText++;
                }else {
                    linkWithText++;
                }
            }
            System.out.println("Title of TV page: "+driver.getTitle());
            System.out.println("Number of links on TV page: "+linksTVpage.size());
            System.out.println("Number of link without text: "+linkWithoutText);
            System.out.println("Number of link with text: "+linkWithText);
        }
      @Test
      public void musicPageTitle_LinkTexts(){
            WebElement musicLink=driver.findElement(By.xpath("//a[@href='/music/']"));
            musicLink.click();
            List<WebElement> linksMusicPage = driver.findElements(By.xpath("//body//a"));
            int linkWithoutText=0;
            int linkWithText=0;
            for (WebElement eachLink:linksMusicPage){
                String textEachLinkMusicPage=eachLink.getText();
                if (textEachLinkMusicPage.equals("")){
                    linkWithoutText++;
                }else {
                    linkWithText++;
                }
            }
            System.out.println("Title of music page: "+driver.getTitle());
            System.out.println("Number of links on music page: "+linksMusicPage.size());
            System.out.println("Number of link without text: "+linkWithoutText);
            System.out.println("Number of link with text: "+linkWithText);
        }
      @Test
      public void supportPageTitle_LinkTexts(){
            WebElement supportLink=driver.findElement(By.xpath("//a[@class=\"ac-gn-link ac-gn-link-support\"]"));
            supportLink.click();
            List<WebElement> linkSupportPage = driver.findElements(By.xpath("//body//a"));
            int linkWithoutText=0;
            int linkWithText=0;
            for (WebElement eachLink:linkSupportPage){
                String textEachLinkSupportPage=eachLink.getText();
                if (textEachLinkSupportPage.equals("")){
                    linkWithoutText++;
                }else {
                    linkWithText++;
                }
            }
            System.out.println("Title of support page: "+driver.getTitle());
            System.out.println("Number of links on support page: "+linkSupportPage.size());
            System.out.println("Number of link without text: "+linkWithoutText);
            System.out.println("Number of link with text: "+linkWithText);
        }
    @AfterMethod
    public void tearDownMethod()throws InterruptedException{
           Thread.sleep(5000);
           driver.close();
        }



}

