package com;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https:\\www.google.com");
        driver.manage().window().maximize();

        driver.switchTo().newWindow(WindowType.TAB);

        driver.switchTo().newWindow(WindowType.TAB);
        // driver.switchTo().newWindow(WindowType.TAB);

        Set<String> windowTabs = driver.getWindowHandles();

        ArrayList<String> lst = new ArrayList<String>(windowTabs);

        driver.switchTo().window(lst.get(1));
        driver.get("http://www.amazon.in");

        driver.switchTo().window(lst.get(2));
        driver.get("http://www.flipkart.com");

        driver.switchTo().window(lst.get(0));
        driver.close();

    }
}
