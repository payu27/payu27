package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Name 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
	
		driver.findElement(By.name("email")).sendKeys("rahul@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys("rahul");
		Thread.sleep(2000);
		
		driver.close();
	}
}
