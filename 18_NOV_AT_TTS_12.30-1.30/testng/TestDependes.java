package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDependes {
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
	@Test(dependsOnMethods = {"testLogin"})
	public void testFlight() {

	}

	@Test
	public void testLogin() {
		
	}
}
