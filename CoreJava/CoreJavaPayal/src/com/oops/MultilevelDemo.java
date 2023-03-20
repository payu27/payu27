package com.oops;

class Employee1 //is an Gparent
{
	public Employee1()
	{
		System.out.println("This is Employee Class...");
	}
	int eid;
	String ename, city;
	public void setEmployeeData()
	{
		eid=1;
		ename="Rahul";
		city="S.nagar";
	}
}
class Department1 extends Employee1 //department is an Parent
{
	public Department1() 
	{
		System.out.println("This is Department Class...");
	}
	String dname;
	public void setDeptData()
	{
		dname="computer";
	}
}
class Project extends Department1 //project is an child
{
	public Project() 
	{
		System.out.println("This is Project Class...");
	}
	String pname;
	public void setProjectData()
	{
		pname="Tops Technologies...";
	}
	public void show()
	{
		System.out.println("eid is.. "+eid);
		System.out.println("ename is.. "+ename);
		System.out.println("city is.. "+city);
		System.out.println("Dname is.. "+dname);
		System.out.println("Project name is.. "+pname);
	}
}
public class MultilevelDemo 
{
	public static void main(String[] args) 
	{
		Project p1=new Project();
		p1.setEmployeeData();
		p1.setDeptData();
		p1.setProjectData();
		p1.show();
	}
}