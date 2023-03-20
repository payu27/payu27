package com.io;

import java.io.File;
import java.io.IOException;

class FDemo
{
	File f1;
	public FDemo()
	{
		f1=new File("a3.txt");
		try 
		{
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void display()
	{
		System.out.println("is file or not... "+f1.isFile());
		System.out.println("is directory or not... "+f1.isDirectory());
		System.out.println("Can i read the file... "+f1.canRead());
		System.out.println("Can i write into the file... "+f1.canWrite());
		System.out.println("path is.. "+f1.getPath());
		System.out.println("Ab.Path is.. "+f1.getAbsolutePath());
	}
}
public class FileDemo 
{
	public static void main(String[] args) 
	{
		FDemo f1=new FDemo();
		f1.display();
		
	}
}
