package com.simple;

public class NestedIFDemo 
{
	public static void main(String[] args) 
	{
		int no=-0;
		if(no >= 0 )
		{
			if(no==0)
			{
				System.out.println("Your no is zero... "+no);
			}
			else
			{
				System.out.println("Your no is Positive... "+no);
			}
		}
		else
		{
			System.out.println("Your no is Negative..."+no);
		}
	}
}
