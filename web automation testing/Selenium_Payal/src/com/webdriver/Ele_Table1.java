package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_Table1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:\\rahul\\payaljava\\Selenium_Payal\\src\\com\\html\\index2.html");
		Thread.sleep(3000);

		WebElement t1= driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[4]"));
		System.out.println("text is.. "+t1.getText());
		
		for(int i=2;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
	String value=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("    |   "+value);
				Thread.sleep(1000);
			}
			System.out.println();
		}
	}
}
