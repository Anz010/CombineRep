package com.syntax.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement login=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        login.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginIn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginIn.click();
        WebElement logo= driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
        boolean isLogoDisplayed= logo.isDisplayed();
        if(isLogoDisplayed){
            System.out.println("The logo is displayed");
        }else{
            System.out.println("There is no logo");
        }


    }
}
