package com.unit1;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FirstDemo 
{
	@Test
	public void test()
	{
		System.out.println("This is passed test....");
	}
	@Test
	public void test1()
	{
		System.out.println("This is Failed test1...");
		fail();
	}
}
