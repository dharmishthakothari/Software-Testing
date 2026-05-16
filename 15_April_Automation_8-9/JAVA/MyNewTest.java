package Demo;

import org.testng.annotations.Test;

public class MyNewTest {
	
	
//  @Test(dependsOnMethods = {"init"})
//  public void addition()
//  {
//	  System.out.println("Addition is "+10+20);
//  }
//  @Test(dependsOnMethods = {"addition"})
//  public void substraction()
//  {
//	  System.out.println("Substraction "+(10-20));
//  }
//  @Test
//  public void init() {
//	  System.out.println("Arithmatic operation ");
//  }
	
	@Test(groups = {"smoke"})
	public void login()
	{
		System.out.println("Login ");
	}
	@Test(groups = {"regression"},dependsOnGroups = {"smoke"})
	public void registration()
	{
		System.out.println("Registration ");
	}
	@Test(groups = {"smoke","regression"})
	public void logout()
	{
		System.out.println("logout");
	}
	
	
}
