package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
    public static String url = "http://the-internet.herokuapp.com/basic_auth";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
    }
}