package com.oops;

import java.util.Scanner;

public class ScannerDemo2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter No : ");
		int no=sc.nextInt();
		//sc.nextLine();
		System.out.println("Enter Name : ");
		String name=sc1.nextLine();
		System.out.println("Your No is.. "+no);
		System.out.println("Your Name is.. "+name);
	}
}
