package com.syntax.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chromedriver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Number of links "+allLinks.size());
        for(WebElement links:allLinks){
            String linkText= links.getText();
            String fullLinks=links.getAttribute("href");
            if(!linkText.isEmpty()){
                System.out.println(linkText+" "+fullLinks);

            }
        }

        }

    }

