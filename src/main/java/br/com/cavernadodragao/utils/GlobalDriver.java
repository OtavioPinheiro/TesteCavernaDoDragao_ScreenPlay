package br.com.cavernadodragao.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalDriver {

    private static WebDriver driver;
//    private static final String chosenBrowser = System.getenv("BROWSER");

    public static WebDriver initiateDriver() throws Exception {
        System.setProperty("webdriver.chrome.driver", Environments.get("chrome"));
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void maximizeWindow() {
//        driver.manage().window().maximize();
    }

    public static void closeDriver() throws Exception {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }
}
