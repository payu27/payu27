package com.extra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotDemo 
{
	@Test
	public void test() throws InterruptedException, IOException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("identifier")).sendKeys("rahulsanghavi.tops@gmail.com");
		Thread.sleep(2000);
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
	}
}
