package com.unit2;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Junit_Parameter 
{
	int fno,sno,eno;
	Addition a1=null;
	@Before
	public void before()
	{
		a1=new Addition();
	}
	
	public Junit_Parameter(int fno,int sno,int eno)
	{
		this.fno=fno;
		this.sno=sno;
		this.eno=eno;
	}
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{1,2,3},{6,7,13},{11,22,3}});
	}
	
	@Test
	public void test()
	{
		System.out.println("My Eno is.. "+eno);
		Assert.assertEquals(eno, a1.sum(fno, sno));
	}
}
