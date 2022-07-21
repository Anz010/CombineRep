package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/anzmac/Documents/IntelliJ IDEA/SeleniumBatch13/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String title = driver.getTitle();
        String expectedTitle = "Web Orders";
        if (title.equals(expectedTitle)) {
            System.out.println("Title is correct");
        } else {
            System.out.println("My title is not correct");
        }

        driver.findElement(By.id("ctl00_logout")).click();
    }
}
