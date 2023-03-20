package com.th;

class First extends Thread
{
	public void run()//running
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My First Thread is..."+i);
		}
		System.out.println("My First Thread is Completed...");		
	}
}
public class ThreadDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		First f1=new First();//newborn
		//f1.setName("Rahul");
		System.out.println(f1);
		f1.start();//runnable
		System.out.println("is alive or not.. "+f1.isAlive());
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(2000);
			System.out.println("My Main Thread is..."+i);
		}
		System.out.println("My Main Thread is Completed...");
		
		System.out.println("is alive or not.. "+f1.isAlive());
	}
}
