package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestWithMultipleData {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
//		 ChromeOptions options = new ChromeOptions();
//
//	        // Enable headless mode
//	        options.addArguments("--headless=new");
//		driver = new ChromeDriver(options);
		
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");
		driver=new FirefoxDriver(options);
		
		//driver.manage().window().maximize();
	}

	@BeforeMethod
	public void openURL() {
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}

	@DataProvider(name = "loginData")
	public Object[][] getData()
	{
		String[][] data= {{"a","a"},{"abc","abc@123"},{"test","test@123"}};
		return data;
	}
	
	
	@Test(dataProvider = "loginData")
	public void login(String username,String pass) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
	}
}
