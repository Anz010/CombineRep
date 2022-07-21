package com.syntax.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chromedriver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement username1= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username1.sendKeys("Admin");
        WebElement login1= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login1.click();
        WebElement error=driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        boolean errorPresents= error.isDisplayed();
        if(errorPresents){
            System.out.println("Please check your password");
        }else {
            System.out.println("Have no idea what to say");
        }
    }
}
