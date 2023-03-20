package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		Thread.sleep(3000);	
		
//		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("rahul123");
//		Thread.sleep(2000);
		
		String name=driver.findElement(By.xpath("//b[text()='Testing']")).getText();
		System.out.println("Text is.. "+name);
		driver.close();
	}
}
