package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
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
	@Test(invocationCount = 2)
	public void testCount()
	{
		System.out.println("in testCount ");
	}
	
	@Test(enabled = false)
	public void checkURL()
	{
		String expectedURL="Mercury Tours";
		String actualURL=driver.getTitle();
//		SoftAssert as=new SoftAssert();
//		as.assertEquals(actualURL, expectedURL);
		
		Assert.assertEquals(actualURL, expectedURL);
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("submit")).click();
		
	}
	
}
