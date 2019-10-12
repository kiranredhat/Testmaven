package SmallPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TestNGAnnotationSequence {
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	@Test(priority=1)
	public void abc()
	{
		System.out.println("Test One");
	}
	@Test(priority=2)
	public void xyz()
	{
		System.out.println("Test Two");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	@AfterMethod	
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
}

