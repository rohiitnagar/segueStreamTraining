package testng;

import org.testng.annotations.Test;

public class Set_Priority {
	 
	@Test(priority=1)
	public void Ytest()
	{
		System.out.println("This is one");
	}
	@Test(priority=3)
	public void Etest()
	{
		System.out.println("This is 3");
	}
	@Test(priority=2)
	public void Gtest()
	{
		System.out.println("This is 2");
 
	}
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class");
 
	}

	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
}
}