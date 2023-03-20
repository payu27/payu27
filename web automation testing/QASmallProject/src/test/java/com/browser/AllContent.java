package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllContent 
{
	WebDriver driver=null;
	public WebDriver selectBrowserWithURL(String browser,String URL)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(URL);
			
		}
		
		return driver;
	}
}
