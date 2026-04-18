package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {
        // 1. Open browser
        ChromeDriver driver = new ChromeDriver();

        // 2. Enter URL
        driver.get("https://demo.guru99.com/test/newtours/");

        // 3. Enter username , Enter Password
        WebElement username = driver.findElement(By.name("userName"));
        WebElement pass = driver.findElement(By.name("password"));

        username.sendKeys("Maitri");
        pass.sendKeys("kfslfksdfk");

        // 4. Click on submit

        WebElement btn = driver.findElement(By.name("submit"));
        btn.click();

    }
}
