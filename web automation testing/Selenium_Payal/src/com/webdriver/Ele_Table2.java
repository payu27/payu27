package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_Table2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);
		
		List<WebElement> th= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Total th is.. "+th.size());
		
		for(int i=1;i<=th.size();i++)
		{
			String thname=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+i+"]")).getText();
			System.out.print("     |     "+thname);
			Thread.sleep(1000);
		}
		
		List<WebElement> tr= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
				System.out.println("Total Tr is.. "+tr.size());
		
		for(int i=1;i<=tr.size();i++)
		{
			for(int j=1;j<=th.size();j++)
			{
				String trname=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("     |     "+trname);
			}
			Thread.sleep(1000);
			System.out.println();
		}
		driver.close();
	}
}
