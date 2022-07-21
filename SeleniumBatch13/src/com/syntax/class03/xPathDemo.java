package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/anzmac/Documents/IntelliJ IDEA/SeleniumBatch13/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        username.sendKeys("Tester");
       WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
       password.sendKeys("test");
        WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();

    }
}
