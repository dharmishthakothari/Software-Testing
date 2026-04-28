package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> lstEle = driver.findElements(By.xpath("//*[@id=\"rows\"]/tr"));
        for (int i = 1; i <= lstEle.size(); i++) {
            System.out.println(driver.findElement(By.xpath("//*[@id=\"rows\"]/tr[" + i + "]/td[1]")).getText());
            System.out.print(driver.findElement(By.xpath("//*[@id=\"rows\"]/tr[" + i + "]/td[2]")).getText());
            System.out.print(driver.findElement(By.xpath("//*[@id=\"rows\"]/tr[" + i + "]/td[3]")).getText());
            System.out.print(driver.findElement(By.xpath("//*[@id=\"rows\"]/tr[" + i + "]/td[4]")).getText());

        }
        driver.quit();
    }
}
