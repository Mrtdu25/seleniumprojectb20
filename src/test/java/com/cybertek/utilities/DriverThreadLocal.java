package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverThreadLocal {

    private DriverThreadLocal() {
    }

    private static ThreadLocal<WebDriver> driverthreadLocal = new ThreadLocal<>();

    public static synchronized WebDriver getDriver() {

        if (driverthreadLocal.get() == null) {
            synchronized (Driver.class) {
                String browser = ConfigurationReader.getProperty("browser");
//            jenkins command: test -Dcucumber.filter.tags="@smoke" -Dbrowser="chrome"
//            custom environment variables: -Dbrowser
//            -Dproperty  = then read in java System.getProperty("property")
//            if env variable was specified
                if (System.getProperty("browser") != null) {
//                then change browser type
//                regardless on value configuration.properties
                    System.out.println("Browser type was changed to: " + System.getProperty("browser"));
                    browser = System.getProperty("browser");
                }
                switch (browser) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverthreadLocal.set(new ChromeDriver());
                        break;

                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverthreadLocal.set(new FirefoxDriver());
                        break;
                    default:
                        throw new RuntimeException("Unimplemented driver type");
                }

            }

        }
        return driverthreadLocal.get();

    }


    public static void closeDriver(){
        if (driverthreadLocal.get()!=null){
            driverthreadLocal.get().quit();
            driverthreadLocal.remove();
        }
    }


}
