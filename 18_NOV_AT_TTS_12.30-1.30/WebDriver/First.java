import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        // FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/");

        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("Title is " + title);
        System.out.println("Current URL IS " + driver.getCurrentUrl());
        // System.out.println(driver.getPageSource());
        WebElement ele = driver.findElement(By.linkText("Downloads"));
        ele.click();
        // driver.quit();
    }
}
