package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement textBox= driver.findElement(By.id("name"));
        textBox.sendKeys("Batch13");

        driver.switchTo().defaultContent();

        WebElement alertButton= driver.findElement(By.id("alert"));
        alertButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys("we are back");

        WebElement frameElement= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textBox.clear();
        textBox.sendKeys("Hold your horses");
    }
}
