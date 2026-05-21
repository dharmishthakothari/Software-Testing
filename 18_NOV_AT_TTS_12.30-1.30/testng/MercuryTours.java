package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MercuryTours {
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		  driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void openURL()
	{
		  driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	
	
  @Test(priority = 1,enabled = false)
  public void validLogin() { 
	  driver.findElement(By.name("userName")).sendKeys("a");
	  driver.findElement(By.name("password")).sendKeys("a");
	  driver.findElement(By.name("submit")).click();
  }
  @Test(priority = 2)
  public void invalidLogin()
  {
	  driver.findElement(By.name("userName")).sendKeys("a");
	  driver.findElement(By.name("password")).sendKeys("a@2134131233");
	  driver.findElement(By.name("submit")).click();
	  
  }
  @AfterClass
  public void closeURL()
  {
	  driver.close();
  }
  
}
