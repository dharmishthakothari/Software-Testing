package com.example;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBookTitle {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://books.toscrape.com/index.html");
        driver.manage().window().maximize();

        List<WebElement> lstElements = driver
                .findElements(By.xpath("//*[@id=\"default\"]/div/div/div/div/section/div[2]/ol/li"));
        // Iterator<WebElement> i = lstElements.iterator();
        for (int i = 1; i < lstElements.size(); i++) {
            String xpath = "//*[@id=\"default\"]/div/div/div/div/section/div[2]/ol/li[" + i + "]/article/h3/a";
            WebElement ele = driver.findElement(By.xpath(xpath));
            System.out.print("Book Title " + ele.getText());
            ele.click();
            Thread.sleep(Duration.ofSeconds(5));
            System.out.println(driver.getTitle());
            driver.navigate().back();
        }
    }
}
