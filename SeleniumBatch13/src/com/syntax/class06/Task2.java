package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.List;

public class Task2 {
    public static String url = "https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categor= driver.findElement(By.id("gh-cat"));
        Select select1=new Select(categor);
        List<WebElement> options= select1.getOptions();
        System.out.println(options.size());

        for(WebElement option1:options){
            String optionText=option1.getText();
            System.out.println(optionText);
        }
        select1.selectByIndex(11);
        WebElement searchButton=driver.findElement(By.id("gh-btn"));
        searchButton.click();

        String title= driver.getTitle();
        if(title.contains("Computer")){
            System.out.println("The header is correct");
        }else{
            System.out.println("The header is not correct");
        }

    }
}