package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_Checkbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(3000);
	
		
//		driver.findElement(By.id("vfb-6-0")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("vfb-6-1")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("vfb-6-2")).click();
//		Thread.sleep(2000);
		
		for(int i=0;i<=2;i++)
		{
			driver.findElement(By.id("vfb-6-"+i)).click();
			Thread.sleep(2000);
		}
		
		driver.close();
	}
}