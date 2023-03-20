package com.keyword;

class TDemo
{
	int no;
	String name;
	public void setData(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	public void display()
	{
		System.out.println("no is.. "+no);
		System.out.println("name is.. "+name);
	}
}
public class ThisDemo 
{
	public static void main(String[] args) 
	{
		TDemo t1=new TDemo();
		t1.setData(123, "Rahul");
		t1.display();
	}
}
