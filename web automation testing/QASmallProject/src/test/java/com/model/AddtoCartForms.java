package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCartForms 
{
	public void clickAddToCart(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
		Thread.sleep(2000);
	}
}
