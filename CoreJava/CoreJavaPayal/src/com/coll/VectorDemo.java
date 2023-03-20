package com.coll;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args)
	{
		Vector v1=new Vector(2);
		System.out.println("Default size is.."+v1.size());
		System.out.println("Default value is.."+v1);
		System.out.println("Default capacity is.."+v1.capacity());
		v1.add(10);
		v1.addElement("Payal");
		v1.add(45.54f);
		v1.add('T');
		v1.addElement(new Integer(123));
		System.out.println("Now size is.."+v1.size());
		System.out.println("Now value is.."+v1);
		System.out.println("Now capacity is.."+v1.capacity());
		v1.remove(0);
		System.out.println("Now size is.."+v1.size());
		System.out.println("Now value is.."+v1);
		System.out.println("Now capacity is.."+v1.capacity());
		
//		Iterator i1=v1.iterator();
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//		}
		
		
		Enumeration e1=v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}
}
