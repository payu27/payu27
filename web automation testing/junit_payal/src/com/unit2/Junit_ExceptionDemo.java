package com.unit2;

import org.junit.Before;
import org.junit.Test;

public class Junit_ExceptionDemo 
{
	ArithmaticExample ae=null;
	@Before
	public void before()
	{
		ae=new ArithmaticExample();
	}
	@Test(expected = ArithmeticException.class)
	public void test()
	{
		ae.getExceptionData(10, 0);
	}
}
