package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithOttherLocator {

    public static void main(String[] args) {

        // 1. Open browser
        ChromeDriver driver = new ChromeDriver();

        // 2. Enter URL
        driver.get("https://demo.guru99.com/test/newtours/");

        // 3. Enter username , Enter Password
        driver.findElement(By.cssSelector(
                "body > div:nth-child(6) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=text]"))
                .sendKeys("a");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("a");
    }

}
