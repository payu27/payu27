package com.simple;

public class DataTypeDemo 
{
	public static void main(String[] args) 
	{
		int i1=2147483647; //4 byte (-2147483648 to +2147483647)
		long l1=12323; //8 byte
		float f1=123.321f;//4 byte
		double d1=333.222d;// 8 byte
		boolean b1=true;// 1 bit
		byte bb=127;//1 byte (- 128 to +127)
		char c1='T';// 2 byte
		System.out.println("Int is.. "+i1);
		System.out.println("Long is.. "+l1);
		System.out.println("Float is.. "+f1);
		System.out.println("Double is.. "+d1);
		System.out.println("Boolean is.. "+b1);
		System.out.println("Byte is.. "+bb);
		System.out.println("Char is.. "+c1);
				
		System.out.println("Integer is.. "+Integer.BYTES+" bytes..");
		System.out.println("Float is.. "+Float.BYTES+" bytes..");
		System.out.println("Long is.. "+Long.BYTES+" bytes..");
		System.out.println("Double is.. "+Double.BYTES+" bytes..");
		System.out.println("Byte is.. "+Byte.BYTES+" bytes..");
		System.out.println("Character is.. "+Character.BYTES+" bytes..");
	}
}
