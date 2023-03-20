package com.coll;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		System.out.println("Default size is.. "+a1.size());
		System.out.println("Original is.. "+a1);
		a1.add(10);
		a1.add(45.25f);
		a1.add('T');
		a1.add("Payal");
		a1.add(new Integer(123));
		a1.add("Payal");
		System.out.println("Now size is.. "+a1.size());
		System.out.println("Now is.. "+a1);
		a1.remove(1);
		System.out.println("Now size is.. "+a1.size());
		System.out.println("Now is.. "+a1);
		a1.remove("Payal");
		System.out.println("Now size is.. "+a1.size());
		System.out.println("Now is.. "+a1);
		
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
