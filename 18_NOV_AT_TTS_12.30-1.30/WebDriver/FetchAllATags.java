package com.example;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchAllATags {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> lst = driver.findElements(By.tagName("a"));
        System.out.println("Total Tags are " + lst.size());
        Iterator<WebElement> i = lst.iterator();
        while (i.hasNext()) {
            WebElement ele = i.next();
            System.out.println(ele.getText());
        }

        driver.quit();
    }
}
