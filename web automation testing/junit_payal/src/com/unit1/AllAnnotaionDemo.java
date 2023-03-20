package com.unit1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AllAnnotaionDemo 
{
	@Before
	public void beforetest()
	{
		System.out.println("Before Test ...");
	}
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("Before Clas... ");
	}
	@Test
	public void test()
	{
		System.out.println("This is main test ... ");
	}
	@Ignore
	@Test
	public void test1()
	{
		System.out.println("This is main test1... ");
	}
	@After
	public void aftertest()
	{
		System.out.println("AFter Test ...");
	}
	@AfterClass
	public static void afterclass()
	{
		System.out.println("After Clas... ");
	}
}
