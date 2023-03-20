package com.oops;

class Sum
{
	int x,y;
	public Sum()//default 
	{
		x=10;
		y=20;
		System.out.println("First Sum is.. "+(x+y));
	}
	public Sum(int a)//Parameterized 
	{
		x=a;
		y=a;
		System.out.println("Second Sum is.. "+(x+y));
	}
	public Sum(int a,int b)//Parameterized 
	{
		x=a;
		y=b;
		System.out.println("Third Sum is.. "+(x+y));
	}
}
public class ConstructorDemo 
{
	public static void main(String[] args)
	{
		Sum s1=new Sum();
		Sum s2=new Sum(100);
		Sum s3=new Sum(55,66);
	}
}