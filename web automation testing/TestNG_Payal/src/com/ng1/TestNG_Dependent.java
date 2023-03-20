package com.ng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_Dependent 
{
	WebDriver driver=null;
	@Test
	public void beforetest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods = {"beforetest"})
	public void enterUsername() throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = {"enterUsername"})
	public void enterPassword() throws InterruptedException
	{
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = {"enterPassword"})
	public void clickLogin() throws InterruptedException
	{
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = {"clickLogin"})
	public void sidemenu() throws InterruptedException
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = {"sidemenu"})
	public void logout() throws InterruptedException
	{
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = {"logout"})
	public void aftertest()
	{
		System.out.println("Bye Bye");
		driver.close();
	}
	
}
