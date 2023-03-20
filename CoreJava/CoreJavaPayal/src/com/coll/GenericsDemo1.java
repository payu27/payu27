package com.coll;

import java.util.ArrayList;

public class GenericsDemo1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		System.out.println("Default size is.. "+a1.size());
		System.out.println("Original is.. "+a1);
		a1.add(10);
		a1.add(new Integer(123));
		System.out.println("Now size is.. "+a1.size());
		System.out.println("Now is.. "+a1);
	}
}
