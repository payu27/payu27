package com.simple;
/*
while :
============
intialization
while(condtion)
{
	statements;
	inc/dec op
}
=================================
do while
-----------
intialization
do
{
	statements;
	inc/dec op
}while(condtion);
==============================================
for :
-------
for(initi ; cond ; inc/dec)
{
	statements;
}

*/
public class LoopingDemo 
{
	public static void main(String[] args) 
	{
//		int i=1;//initialization
//		while(i<=5)//condition
//		{
//			System.out.println(i);//statements
//			i++;
//		}
//		//how many line of code will be performed in back side : 17  
		
//		int i=1;//initialization
//		do
//		{
//			System.out.println(i);//statements
//			i++;
//		}while(i<=5);//condition
//		//how many line of code will be performed in back side : 21  
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		//how many line of code will be performed in back side : 11
	}
}
