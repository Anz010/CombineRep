package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","/Users/anzmac/Documents/IntelliJ IDEA/SeleniumBatch13/Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title+" "+url);
        driver.quit();
    }
}
