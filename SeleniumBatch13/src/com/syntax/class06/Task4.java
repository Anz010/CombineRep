package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement box1= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        box1.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement box2= driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        box2.click();
        Thread.sleep(2000);
        Alert alert1=driver.switchTo().alert();
        alert1.dismiss();

        WebElement box3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        box3.click();
        Thread.sleep(2000);
        Alert alert2=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        driver.quit();
    }
}