package com.example;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTableDataFetch {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button")).click();
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // wait.until(ExpectedConditions.urlContains("pavantestingtools.com"));
        // System.out.println(driver.getCurrentUrl());
        Set<String> set = driver.getWindowHandles();
        List<String> lst1 = new ArrayList<String>(set);
        System.out.println(lst1);
        driver.switchTo().defaultContent();
        driver.switchTo().window(lst1.get(1));

        String xpath = "//*[@id=\"post-body-1913301563129296288\"]/h2";
        List<WebElement> lst = driver.findElements(By.xpath(xpath));
        for (int i = 1; i <= lst.size(); i++) {
            String xpath_span = "//*[@id=\"post-body-1913301563129296288\"]/h2[" + i + "]/span";
            WebElement ele = driver.findElement(By.xpath(xpath_span));
            System.out.println(ele.getText());

        }
        driver.quit();

    }
}
