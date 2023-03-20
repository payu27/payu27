package com.keyword;

interface Customer1
{
	int mno2=123123;
	//public void show();
}
public interface Customer extends Customer1
{
	int mno=98765;
	public static void setCustomer()
	{
		System.out.println("mno is.. "+mno);
	}
}
