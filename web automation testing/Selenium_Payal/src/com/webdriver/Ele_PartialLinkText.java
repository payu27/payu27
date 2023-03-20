package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_PartialLinkText 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:\\rahul\\payaljava\\Selenium_Payal\\src\\com\\html\\index.html");
		Thread.sleep(3000);
	
		driver.findElement(By.partialLinkText("H")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/a[2]")).click();
//		Thread.sleep(2000);
		driver.close();		
	}
}
