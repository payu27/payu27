package com.coll;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo2 
{
	public static void main(String[] args)
	{
		ArrayList<Student> a1=new ArrayList<Student>();
		
		Student s1=new Student();
		s1.setSno(123);
		s1.setSname("Rahul");
		s1.setCity("S.nagar");
		Student s2=new Student();
		s2.setSno(1234);
		s2.setSname("Payal");
		s2.setCity("G.nagar");
		
		a1.add(s1);
		a1.add(s2);
		System.out.println(a1);
		
		Iterator<Student> i1=a1.iterator();
		while(i1.hasNext())
		{
			Student s=i1.next();
			System.out.println("Sno is.. "+s.getSno());
			System.out.println("Sname is.. "+s.getSname());
			System.out.println("City is.. "+s.getCity());
			System.out.println();
		}
	}
}
