package com.oops;

class Addition
{
	int x,y;
	public void sum()
	{
		x=10;
		y=20;
		System.out.println("First Sum is.. "+(x+y));
	}
	public void sum(int a)
	{
		x=a;
		y=a;
		System.out.println("Second Sum is.. "+(x+y));
	}
	public void sum(float a)
	{
		x=(int)a;
		y=(int)a;
		System.out.println("Float Sum is.. "+(x+y));
	}
	public void sum(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("Third Sum is.. "+(x+y));
	}
}
public class MethodOverloadingDemo 
{
	public static void main(String[] args) 
	{
		Addition a1=new Addition();
		a1.sum();
		a1.sum(123);
		a1.sum(78, 98);
		a1.sum(55.55f);
	}
}
