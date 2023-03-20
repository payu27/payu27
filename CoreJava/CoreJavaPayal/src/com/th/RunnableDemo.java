package com.th;
class Second implements Runnable
{
	@Override
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
			System.out.println("My Second Thread is..."+i);
		}
		System.out.println("My Second Thread is Completed...");		
	}	
}
public class RunnableDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		Second s1=new Second();
		Thread t1=new Thread(s1);
		t1.start();
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(2000);
			System.out.println("My Main Thread is..."+i);
		}
		System.out.println("My Main Thread is Completed...");
	}
}
