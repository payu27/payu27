package com.cls;
public class CommonClass3 
{
	public static void main(String[] args)
	{
		Integer i1=new Integer(123);
		System.out.println("AutoBoxing is.. "+i1);
		
		int a=100;
		Integer i2=new Integer(a);
		System.out.println("Boxing is.. "+i2);
	
		String s="786asdfasdf";
//		int x=Integer.parseInt(s);
//		System.out.println("UnBoxing is.. "+x);

		int z=i1.intValue();
		System.out.println("Z is.. "+z);
		
		String str=i1.toString();
		System.out.println("Str is.. "+str);
		
		Object o1=new Object();
		o1=s;
		System.out.println("Object is.. "+o1);
	}
}
