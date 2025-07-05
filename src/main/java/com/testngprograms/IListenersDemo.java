package com.testngprograms;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ITestlistenerImplement.class)
public class IListenersDemo 
{

	@Test
	public void testmethod1()
	{
		System.out.println("In Method 1");
	}
	@Test(timeOut=1000)
	public void testmethod2() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("In Method 2");
	}
	@Test(dependsOnMethods = "testmethod2")
	public void testmethod3()
	{
		System.out.println("In Method 3");
		Assert.assertTrue(false);
	}
	@Test
	public void testmethod4()
	{
		System.out.println("In Method 4");
	}
}
