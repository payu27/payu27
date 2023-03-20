package com.simple;

public class TypeConversionDemo 
{
	public static void main(String[] args) 
	{
		int i1=100; // 4 bytes
		
		long l1 ;//8 byte
		
		l1= i1; //implicit
		System.out.println("Implicit is.. "+l1);
		
		int x;
		x=(int)l1; //explicit
		System.out.println("Explicit is.. "+x);
		
		int z=129;//4 byte
		byte b=(byte)z;//1 byte
		System.out.println("Byte explicit is.. "+b);
		
	}
}
