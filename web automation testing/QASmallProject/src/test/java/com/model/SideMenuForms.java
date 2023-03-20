package com.model;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SideMenuForms 
{
	public void openSideMenu(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
	}
	public void openAllItemsMenu(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("inventory_sidebar_link")).click();
		Thread.sleep(2000);
	}
	public void openResetAppMenu(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("reset_sidebar_link")).click();
		Thread.sleep(2000);
	}
	public void closeSideMenu(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("react-burger-cross-btn")).click();
		Thread.sleep(2000);
	}
	public void openAboutusMenu(WebDriver driver) throws InterruptedException, IOException
	{
		driver.findElement(By.id("about_sidebar_link")).click();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("https://saucelabs.com/"))
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("D:\\screenshot\\error.png");
			Thread.sleep(2000);
			FileUtils.copyFile(src, dest);
			Thread.sleep(2000);
			driver.navigate().back();
			fail("go to another website...");
		}
		
		
	}
}
