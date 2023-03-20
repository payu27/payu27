package com.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		System.out.println("Title is.. "+driver.getTitle());
		System.out.println("Current URL is.. "+driver.getCurrentUrl());
		
		if(driver.getTitle().equals("Google"))
		{
			System.out.println("Your Test Has been passed...");
		}
		else
		{
			System.out.println("Your Test has been Failed...");
		}
		
		driver.close();
		//driver.quit();
	}
}
