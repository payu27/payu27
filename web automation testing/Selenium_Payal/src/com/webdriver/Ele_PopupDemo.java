package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_PopupDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Here")).click();
		Thread.sleep(2000);
		
		String mainw=driver.getWindowHandle();
		System.out.println("Main Window string is.. "+mainw);
		
		Set<String> allw= driver.getWindowHandles();
		Iterator<String> i1=allw.iterator();
		while(i1.hasNext())
		{
			String childw=i1.next();
			System.out.println("Child window is.. "+childw);
			if(!mainw.equals(childw))
			{
				driver.switchTo().window(childw);//from one tab/window to another
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("rahul@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(mainw);
		Thread.sleep(2000);
		System.out.println("Title is.. "+driver.getTitle());
		Thread.sleep(2000);
		driver.close();		
	}
}
