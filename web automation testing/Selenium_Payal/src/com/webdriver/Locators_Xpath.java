package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Xpath 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
		Thread.sleep(2000);
				
		driver.close();
	}
}
