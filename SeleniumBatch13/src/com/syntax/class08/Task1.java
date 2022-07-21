package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 {
    public static String url = "https://syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement getNewUserButton = driver.findElement(By.id("startButton"));
        getNewUserButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

        WebElement firstName = driver.findElement(By.id("finish"));
        System.out.println(firstName.getText());
    }
}
