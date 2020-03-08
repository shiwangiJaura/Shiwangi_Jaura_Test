package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main1 {

    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\301044130\\Desktop\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String baseUrl = "http://demo.guru99.com/test/login.html";
            driver.get(baseUrl);
            WebElement email = driver.findElement(By.id("email"));
            WebElement password = driver.findElement(By.id("passwd"));
            email.sendKeys("shiwangi2309@gmail.com");
            password.sendKeys("Shiwangi23");
            WebElement SignIn = driver.findElement(By.id("SubmitLogin"));
            SignIn.submit();
        }

    }


