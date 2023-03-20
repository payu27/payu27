package com.oops;

import java.util.Scanner;

public class ScannerDemo1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1 : ");
		int x=sc.nextInt();
		System.out.println("Enter no2 : ");
		int y=sc.nextInt();
		System.out.println("Sum is.. "+(x+y));
	}
}
