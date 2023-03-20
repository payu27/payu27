package com.coll;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		System.out.println("Original value is.. "+h1);
		System.out.println("Original size is.. "+h1.size());
		h1.add(10);
		h1.add(45.25f);
		h1.add('T');
		h1.add("Payal");
		h1.add(new Integer(123));
		h1.add("Payal");
		System.out.println("Now value is.. "+h1);
		System.out.println("Now size is.. "+h1.size());
		h1.remove("Payal");
		System.out.println("Now value is.. "+h1);
		System.out.println("Now size is.. "+h1.size());
		Iterator i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
