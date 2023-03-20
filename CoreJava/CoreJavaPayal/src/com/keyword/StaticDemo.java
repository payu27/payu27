package com.keyword;

class SDemo
{
	int no;//local variable
	static int sno;//static variable
	public static void show()
	{
		//no=123;
		sno=321;
		//System.out.println("In side static method no is.. "+no);
		System.out.println("In side static method sno is.. "+sno);
	}
}
public class StaticDemo 
{
	public static void main(String[] args) 
	{
		SDemo s1=new SDemo();
		SDemo s2=new SDemo();
		SDemo s3=new SDemo();
		SDemo.show();
		s1.no=10;
		s2.no=20;
		s3.no=30;
		System.out.println("s1.no is.. "+s1.no);
		System.out.println("s2.no is.. "+s2.no);
		System.out.println("s3.no is.. "+s3.no);
		
		s1.sno=10;
		s2.sno=20;
		s3.sno=30;
		System.out.println("s1.sno is.. "+s1.sno);
		System.out.println("s2.sno is.. "+s2.sno);
		System.out.println("s3.sno is.. "+s3.sno);		
	}
}