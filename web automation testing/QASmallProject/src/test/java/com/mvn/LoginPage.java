package com.mvn;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.browser.AllContent;
import com.model.AddtoCartForms;
import com.model.LoginForms;
import com.model.SideMenuForms;

public class LoginPage 
{
	WebDriver driver=null;
	LoginForms l1=null;
	AddtoCartForms a1=null;
	SideMenuForms s1=null;
	@BeforeTest
	public void beforemethod()
	{
		l1=new LoginForms();
		s1=new SideMenuForms();
		a1=new AddtoCartForms();
	}
	@BeforeClass
	public void beforeclass() throws InterruptedException
	{
		driver=new AllContent().selectBrowserWithURL("chrome", "https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	@AfterClass
	public void afterclass() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	@Test(priority = 0)
	public void loginDetails() throws InterruptedException
	{
		l1.enterUsername(driver, "standard_user");
		l1.enterPassword(driver, "secret_sauce");
		l1.clickLogin(driver);
	}
	@Ignore
	@Test(priority = 1)
	public void sideMenuDetails() throws InterruptedException, IOException
	{
		s1.openSideMenu(driver);
		s1.openAllItemsMenu(driver);
		s1.openResetAppMenu(driver);
		s1.openAboutusMenu(driver);
		s1.closeSideMenu(driver);
	}
	@Test(priority = 2)
	public void addToCartDetails() throws InterruptedException, IOException
	{
		a1.clickAddToCart(driver);
	}
}
