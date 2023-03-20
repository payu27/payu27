package com.oops;

class A //is an parent
{
	int a;
	public void setA()
	{
		a=10;
	}
}
class B extends A //b is child of parent A
{
	int b;
	public void setB()
	{
		b=20;
	}
	public void display()
	{
		System.out.println("B is... "+(a+b));
	}
}
class C extends A //c is child of parent A
{
	int c;
	public void setC()
	{
		c=30;
	}
	public void display()
	{
		System.out.println("C is... "+(a+c));
	}
}
public class HierarchicalDemo 
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.setA();
		b1.setB();
		b1.display();	
		
		C c1=new C();
		c1.setA();
		c1.setC();
		c1.display();
	}
}
