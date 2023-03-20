package com.simple;

public class ElseIFLadderDemo 
{
	public static void main(String[] args) 
	{
		int a=10,b=10,c=10;
		if(a>b && a>c)
		{
			System.out.println("A is max...");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is max...");
		}
		else
		{
			System.out.println("C is max...");
		}
	}
}
