package com.keyword;

class Product
{
	String pname;
	public void setProduct()
	{
		pname="Phone";
	}
}
class InterDemo extends Product implements Customer,Customer1
{
	/*
	 * @Override public void show() { System.out.println("second mno is.. "+mno2);
	 * System.out.println("Phone name is.. "+pname); }
	 */
}
public class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		InterDemo i1=new InterDemo();
		i1.setProduct();
		Customer.setCustomer();
		//i1.show();
	}
}
