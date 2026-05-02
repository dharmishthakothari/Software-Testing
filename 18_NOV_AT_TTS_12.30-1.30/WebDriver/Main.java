package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {

    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        // driver.findElement(By.id("datepicker")).sendKeys("02/20/2026");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("window.scrollBy(0,1500)");
        // driver.findElement(By.id("txtDate")).click();
        // driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]/a")).click();

        // driver.findElement(By.id("start-date")).sendKeys("01-01-2026");
        // driver.findElement(By.id("end-date")).click();

        Actions action = new Actions(driver);
        // WebElement ele = driver.findElement(By.cssSelector("#HTML10 >
        // div.widget-content > button"));
        // action.doubleClick(ele);
        // action.build().perform();

        WebElement ele = driver.findElement(By.id("draggable"));
        WebElement ele1 = driver.findElement(By.id("droppable"));
        action.dragAndDrop(ele, ele1);
        action.build().perform();
    }
}