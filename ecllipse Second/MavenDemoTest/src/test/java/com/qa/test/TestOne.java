package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne 
{
	@Test
	public void sum()
	{
		System.out.print("Sum Method Test");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void sub()
	{
		System.out.print("Sub Method Test");
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
	}
	@Test
	public void multi()
	{
		System.out.print("Div Method Test");
		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
	}
	
	

}
