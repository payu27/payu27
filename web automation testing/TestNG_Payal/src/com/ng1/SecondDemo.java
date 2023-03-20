package com.ng1;

import org.testng.annotations.Test;

public class SecondDemo 
{
	@Test(priority = 0)
	public void test()
	{
		System.out.println("This is Main Test...");
	}
	@Test(priority = 3)
	public void Aest()
	{
		System.out.println("This is Main Aest...");
	}
	@Test(priority = 1)
	public void Zest()
	{
		System.out.println("This is Main Zest...");
	}
	@Test(priority = 2)
	public void Rest()
	{
		System.out.println("This is Main Rest...");
	}
}
