package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_AlertDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		
		WebElement t1= driver.findElement(By.name("cusid"));
		t1.sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		Alert a1= driver.switchTo().alert();
		System.out.println("First Alert message is.. "+a1.getText());
		//a1.dismiss();
		a1.accept();//ok button clicked
		Thread.sleep(2000);
		
		Alert a2=driver.switchTo().alert();
		System.out.println("Second Alert message is.. "+a2.getText());
		a2.accept();
		Thread.sleep(2000);
				
		driver.close();
	}
}
