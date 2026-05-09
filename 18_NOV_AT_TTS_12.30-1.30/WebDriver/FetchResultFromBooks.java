package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchResultFromBooks {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://books.toscrape.com/index.html");
        String xpath = "//*[@id=\"default\"]/div/div/div/aside/div[2]/ul/li/ul/li";
        List<WebElement> lst = driver.findElements(By.xpath(xpath));
        for (int i = 1; i <= lst.size(); i++) {
            String xpathA = "//*[@id=\"default\"]/div/div/div/aside/div[2]/ul/li/ul/li[" + i + "]/a";
            WebElement ele = driver.findElement(By.xpath(xpathA));
            System.out.print(ele.getText());
            ele.click();
            WebElement result = driver.findElement(By.xpath("//*[@id=\"default\"]/div/div/div/div/form"));
            System.out.println("\t\t" + result.getText());
        }
        driver.quit();
    }
}
