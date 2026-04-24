package com.example;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDemo {
    public static void main(String[] args) {
        // 1. Open browser
        ChromeDriver driver = new ChromeDriver();

        // // 2. Enter URL
        // driver.get("https://demo.guru99.com/test/newtours/");

        // driver.findElement(By.linkText("REGISTER")).click();

        // WebElement eleCountry = driver.findElement(By.name("country"));
        // Select sel = new Select(eleCountry);

        // // sel.selectByValue("BAHAMAS");
        // sel.selectByIndex(10);

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement> lstElement = driver.findElements(By.name("gender"));
        System.out.println(lstElement.size());
        Iterator<WebElement> i = lstElement.iterator();
        while (i.hasNext()) {
            WebElement ele = i.next();

            if (ele.getAttribute("value").equals("male")) {
                ele.click();
            }
        }

        List<WebElement> lstDays = driver.findElements(By.className("form-check-input"));
        Iterator<WebElement> i1 = lstDays.iterator();
        while ((i1.hasNext())) {
            WebElement ele = i1.next();
            if (ele.getAttribute("value").equals("sunday") || ele.getAttribute("value").equals("wednesday")) {
                ele.click();
            }

        }

        // WebElement ele = driver.findElement(By.id("country"));
        // Select selCountry = new Select(ele);
        // // selCountry.selectByValue("uk");
        // selCountry.selectByVisibleText("United Kingdom");

    }

}
