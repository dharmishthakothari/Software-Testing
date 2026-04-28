package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        // driver.findElement(By.id("alertBtn")).click();
        // Alert alert = driver.switchTo().alert();

        // Thread.sleep(3000);

        // alert.accept();

        driver.findElement(By.id("confirmBtn")).click();
        Alert alert = driver.switchTo().alert();

        Thread.sleep(3000);
        alert.dismiss();

    }

}
