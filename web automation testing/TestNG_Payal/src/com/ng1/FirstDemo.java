package com.ng1;

import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class FirstDemo 
{
	@Test
	public void test()
	{
		System.out.println("This is Passed Test...");
	}
	@Test
	public void test1()
	{
		System.out.println("This is Failed Test...");
		fail();
	}
	@Test
	public void test2()
	{
		System.out.println("This is Skipped Test...");
		throw new SkipException("self skipped");
	}	
}
