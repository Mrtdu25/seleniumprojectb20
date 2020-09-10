package com.cybertek.tests.day3_cssSelecter_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class TestWebDriverFactory {
    public static void main(String[] args) {

      WebDriver driver= WebDriverFactory.getDriver("chrome");
      driver.get("https://www.youtube.com");



    }
}
