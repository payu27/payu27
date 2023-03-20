package com.oops;

class Employee //is an parent
{
	int eid;
	String ename, city;
	public void setEmployeeData()
	{
		eid=1;
		ename="Rahul";
		city="S.nagar";
	}
}
class Department extends Employee //department is an child
{
	String dname;
	public void setDeptData()
	{
		dname="computer";
	}
	public void show()
	{
		System.out.println("eid is.. "+eid);
		System.out.println("ename is.. "+ename);
		System.out.println("city is.. "+city);
		System.out.println("Dname is.. "+dname);
	}
}
public class InheritanceDemo1 
{
	public static void main(String[] args) 
	{
		Department d1=new Department();
		d1.setEmployeeData();
		d1.setDeptData();
		d1.show();
	}
}
