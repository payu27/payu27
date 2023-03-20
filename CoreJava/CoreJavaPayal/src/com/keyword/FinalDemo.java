package com.keyword;

final class FDemo
{
	final int no=20;
	String name;
	public final void setData()
	{
		//no=123;
		name="Rahul";
	}
	public void show()
	{
		System.out.println("no is.. "+no);
		System.out.println("name is.. "+name);
	}
}

public class FinalDemo 
{
	public static void main(String[] args)
	{
		FDemo f1=new FDemo();
		f1.setData();
		f1.show();
	}
}
