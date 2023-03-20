package com.extra;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotDemo 
{
	@Test
	public void test() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	
		Thread.sleep(2000);
	
		for(int i=1;i<=5;i++)
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des=new File("D:\\screenshot\\"+i+".png");
			FileUtils.copyFile(src, des);
				Thread.sleep(2000);
		}
		
		
	}
	
}
