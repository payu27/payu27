package com.oops;

import java.util.Scanner;

public class ArrayDemo2 
{
	public static void main(String[] args)
	{
		int[][] a=new int[3][3];
		int k=1;
//		for(int i=0;i<=2;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				a[i][j]=k++;
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter Value.. ");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
