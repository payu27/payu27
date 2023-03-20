package com.keyword;

abstract class ADemo
{
	int no;
	String name;
	public abstract void setData();
	public void show()
	{
		System.out.println("no is.. "+no);
		System.out.println("name is.. "+name);
	}
}
class Demo extends ADemo
{
	@Override
	public void setData()
	{
		no=123;
		name="Rahul";
	}
}
public class AbstractDemo 
{
	public static void main(String[] args) 
	{
		Demo a1=new Demo();
		a1.setData();
		a1.show();
	}
}
