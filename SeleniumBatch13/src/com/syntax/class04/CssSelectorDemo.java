package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/anzmac/Documents/IntelliJ IDEA/SeleniumBatch13/Drivers/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement startPracticingButton=driver.findElement(By.cssSelector("a#btn_basic_example"));
    startPracticingButton.click();
        Thread.sleep(2000);
    WebElement simpleForDemo=driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling::a"));
    simpleForDemo.click();
        Thread.sleep(2000);
    WebElement textBox= driver.findElement(By.cssSelector("input[placeholder^='Please enter your Message']"));
    textBox.sendKeys("Hello world");
    WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick*='showInput();']"));
    showMessageButton.click();

    Thread.sleep(2000);
    }
}
