package com.th;

public class StaticThreadDemo 
{
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1);//
		t1.setName("Payal");
		System.out.println(t1);//
		t1.setPriority(Thread.MIN_PRIORITY);//10
		System.out.println(t1);//
		System.out.println("is alive or not.. "+t1.isAlive());
	}
}
