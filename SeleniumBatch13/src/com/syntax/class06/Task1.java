package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement registration= driver.findElement(By.partialLinkText("Create"));
        registration.click();
        Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anzor");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Anzarov");
        Thread.sleep(1000);
        WebElement email= driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("8458426322");
       WebElement password=driver.findElement(By.id("password_step_input"));
       password.sendKeys("12323232A");
        WebElement month= driver.findElement(By.id("month"));
        Select selectMonth=new Select(month);
        selectMonth.selectByIndex(7);
        List<WebElement> numOfMonth=selectMonth.getOptions();
        System.out.println("The numbers of month to choos "+numOfMonth.size());


        Thread.sleep(1000);
        WebElement day= driver.findElement(By.id("day"));
        Select selectDay=new Select(day);
        selectDay.selectByIndex(29);
        List<WebElement> numOfDays=selectDay.getOptions();
        System.out.println("The numbers of month to choos "+numOfDays.size());

        Thread.sleep(1000);
        WebElement year= driver.findElement(By.id("year"));
        Select selectYear=new Select(year);
        selectYear.selectByIndex(29);
        List<WebElement> numOfYears=selectYear.getOptions();
        System.out.println("The numbers of month to choos "+numOfYears.size());

        WebElement button=driver.findElement(By.xpath("//input[@value='2']"));
        button.click();
        Thread.sleep(1000);
       driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
        driver.quit();




    }}
