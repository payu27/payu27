package com.cls;

public class CommonClass1 
{
	public static void main(String[] args) 
	{
		String s1=new String("This is Tops Technologies...");
		System.out.println("Original String is.. "+s1);
		System.out.println("length is.. "+s1.length());
		System.out.println("Upper case is.. "+s1.toUpperCase());
		System.out.println("Lower case is.. "+s1.toLowerCase());
		System.out.println("Substring is.. "+s1.substring(2));
		System.out.println("Substring is.. "+s1.substring(2,4));
		System.out.println("Char at is.. "+s1.charAt(2));
		System.out.println("trim is... "+s1.trim());
		if(s1.equalsIgnoreCase("this is Tops Technologies..."))
		{
			System.out.println("Both are match...");
		}
		else 
		{
			System.out.println("Both are not match...");
		}
	}
}
