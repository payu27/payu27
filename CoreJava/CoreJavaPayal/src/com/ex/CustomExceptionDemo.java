package com.ex;

import java.util.Scanner;

class PayalException extends Exception
{
	double amount;
	public PayalException(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println(amount+ " rs deposited...");
	}
	public void withdrawal(double amount) throws PayalException
	{
		if(amount<=balance)
		{
			balance = balance - amount;
			System.out.println(amount+" rs withdrawal successfully...");
		}
		else
		{
			double needs=amount - balance;
			throw new PayalException(needs);
		}
	}

}
public class CustomExceptionDemo 
{
	public static void main(String[] args)
	{
		ATM a1=new ATM();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount for deposit...");
		double amount=sc.nextDouble();
		a1.deposit(amount);
		System.out.println("Enter amount for withdrawal...");
		amount=sc.nextDouble();
		try 
		{
			a1.withdrawal(amount);
		} catch (PayalException e) 
		{
			System.out.println("if you enter "+e.amount+ " rs more into your account then you withdrawal "+amount+ " rs ");
			e.printStackTrace();
		}
		
	}
}
