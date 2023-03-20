package com.ex;

import java.util.Scanner;

public class ExceptionDemo2 
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			int[] a=new int[5];
			for(int i=0;i<6;i++)
			{
				System.out.println("Enter value.. ");
				a[i]=sc.nextInt();
			}
			for(int i=0;i<5;i++)
			{
				System.out.println("Value is.. "+a[i]);
			}
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
	}
}
