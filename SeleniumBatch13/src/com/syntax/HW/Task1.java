package com.syntax.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        WebElement start= driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        start.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo=driver.findElement(By.xpath("//a[text()='Simple Form Demo']/parent::div"));
        simpleFormDemo.click();
        WebElement textBox=driver.findElement(By.xpath("//input[@id='user-message']"));
        textBox.sendKeys("Good morning");
        Thread.sleep(2000);
        WebElement showMessage= driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessage.click();
        driver.quit();
    }
}
