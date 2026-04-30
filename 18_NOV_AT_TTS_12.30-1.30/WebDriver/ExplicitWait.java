package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.name("userName")).sendKeys("a");
        driver.findElement(By.name("password")).sendKeys("a");
        driver.findElement(By.name("submit")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains("sucess"));
        String expectedOutput = "Login Successfully";
        String actualOutput = driver.findElement(By.xpath(
                "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"))
                .getText();
        if (expectedOutput.equals(actualOutput)) {
            System.out.println("User logged in");
        } else
            System.out.println("User count not logged in");

    }
}
