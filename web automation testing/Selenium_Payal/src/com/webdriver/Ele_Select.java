package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ele_Select 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);
		
		WebElement e1=driver.findElement(By.name("country"));
		Select s1=new Select(e1);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		s1.selectByValue("ANGOLA");
		Thread.sleep(2000);
		s1.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		
		for(int i=0;i<50;i++)
		{
			s1.selectByIndex(i);
			Thread.sleep(1000);	
		}
		
		driver.close();
	}
}
