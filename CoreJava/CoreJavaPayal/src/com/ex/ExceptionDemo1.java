package com.ex;

import java.util.Scanner;

public class ExceptionDemo1 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter No1 : ");
			int a=sc.nextInt();
			System.out.println("Enter No2 : ");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Your Division is.. "+c);
			System.out.println("Your Program is Completed...");
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This Program is Developed By : ");
			System.out.println("Rahul Sanghavi");
			System.out.println("Mo : 9016545414");
		}
		
		
	}
}
