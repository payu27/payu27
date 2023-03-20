package com.simple;

public class IfElseDemo 
{
	public static void main(String[] args) 
	{
		int no=0;
		if(no %2==0) //condition
		{
			System.out.println("your no is even... "+no); //statements
		}	
		else
		{
			System.out.println("your no is odd... "+no); //statements
		}	
		
		int year=2000;
		if(year %4==0) //condition
		{
			System.out.println("year is leap year... "+year); //statements
		}	
		else
		{
			System.out.println("year is not leap year... "+year); //statements
		}		
	}
}
