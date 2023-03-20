package com.oops;

class Student
{
	int rno;
	String name,city; //data member 
	public void setData() //member function /methods
	{
		rno=1234;
		name="Rahul";
		city="S.nagar";
	}
	public void display()
	{
		System.out.println("Rno is.. "+rno);
		System.out.println("Name is.. "+name);
		System.out.println("City is.. "+city);
		
	}
}
public class ClassDemo 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setData();
		s1.display();
		s1.display();
		s1.display();
		System.out.println("rno is.. "+s1.rno);
	}
}
