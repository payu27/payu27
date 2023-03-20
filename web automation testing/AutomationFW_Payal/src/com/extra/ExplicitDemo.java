package com.extra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitDemo 
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		Thread.sleep(2000);
		
		WebDriverWait w1=new WebDriverWait(driver, 10);
		WebElement e1= w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));		
		Thread.sleep(2000);
		driver.close();
	}
}
