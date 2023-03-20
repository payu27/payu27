package com.unit1;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AssertionDemo 
{
	@Ignore
	@Test
	public void test()
	{
		int a=10,b=5;
		//Assert.assertTrue(a>b);
		Assert.assertFalse(a>b);
	}
	@Ignore
	@Test
	public void test1()
	{
		String s1=null;
		String s2="Payal";
		//Assert.assertNull(s2);
		Assert.assertNotNull(s2);
	}
	@Ignore
	@Test
	public void test2()
	{
		int i1=123;
		int i2=123;
		
		String s1=null;
		String s2="Payal";
		String s3="Payal";
		Assert.assertSame(i1, i2);
		//Assert.assertNotSame(s1, s3);
		Assert.assertEquals(s3, s2);
	}
	@Ignore
	@Test
	public void test5()
	{
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,5};
		Assert.assertArrayEquals(a, b);
	}
	@Test
	public void testfail()
	{
		System.out.println("Self Failed...");
		fail("Self Faled by payal");
	}
	

}

