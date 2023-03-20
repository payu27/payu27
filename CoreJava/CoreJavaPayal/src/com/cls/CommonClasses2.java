package com.cls;

public class CommonClasses2 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("This is Tops Technologies...");
		System.out.println("Original String is.. "+s1);
		System.out.println("length is.. "+s1.length());
		s1.insert(0, "Hii ");
		System.out.println("Original String is.. "+s1);
		System.out.println("length is.. "+s1.length());
		s1.append("Hello Rahul....");
		System.out.println("Original String is.. "+s1);
		System.out.println("length is.. "+s1.length());
		s1.delete(0, 4);
		System.out.println("Original String is.. "+s1);
		System.out.println("length is.. "+s1.length());
		System.out.println(s1.reverse());
		System.out.println("Original String is.. "+s1.reverse());
		System.out.println("length is.. "+s1.length());
		System.out.println(s1.toString().toUpperCase());
	}
}
