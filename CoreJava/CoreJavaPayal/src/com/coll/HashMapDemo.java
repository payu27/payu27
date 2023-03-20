package com.coll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap h1=new HashMap();
		System.out.println("Default size is.. "+h1.size());
		System.out.println("Default value is.. "+h1);
		h1.put(1, "Payal");
		h1.put("Payal",1);
		h1.put('R', "Rahul");
		h1.put(new Integer(456), new Double(786.65));
		h1.put(1, "Payal");
		System.out.println("Now size is.. "+h1.size());
		System.out.println("Now value is.. "+h1);
		h1.remove(1);
		h1.remove(456);
		System.out.println("Now size is.. "+h1.size());
		System.out.println("Now value is.. "+h1);
		
		Set s1=h1.entrySet();
		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			Map.Entry me=(Map.Entry)i1.next();
			System.out.println("Key is.. "+me.getKey());
			System.out.println("Value is.. "+me.getValue());
			System.out.println();
			
//			String s=i1.next().toString();
//			String[] str=s.split("=");
//			System.out.println("Key is. "+str[0]);
//			System.out.println("Value is. "+str[1]);
//			System.out.println();
		}
	}
}
