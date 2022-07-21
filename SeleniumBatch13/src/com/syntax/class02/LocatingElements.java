package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/anzmac/Documents/IntelliJ IDEA/SeleniumBatch13/Drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://fb.com");
        driver.findElement(By.id("email")).sendKeys("syntax@gfdsgd.com");
        driver.findElement(By.id("pass")).sendKeys("12234");
        driver.findElement(By.name("login")).click();

        driver.findElement(By.linkText("Forgot password?")).click();



    }
}
