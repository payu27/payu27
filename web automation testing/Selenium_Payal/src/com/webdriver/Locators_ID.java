package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_ID 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("rahul@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("rahul");
		Thread.sleep(2000);
		
		driver.close();
	}
}
