package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MercuryParam {
	
	
WebDriver driver;
	@Parameters({"username","pass","browser"})
  @Test
  public void f(String username,String pass,String browser) {
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println(username+"\t"+pass);
		}else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
			driver=new EdgeDriver();
		
		driver.get("https://www.google.com");
  }
}
