package com.fw;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KeywordDrivenFW 
{
	@DataProvider(name="rahul")
	public Object[][] readExcel() throws InvalidFormatException, IOException
	{
		Object[][] data=null;
		
		String filepath="D:\\rahul\\payalpoi.xlsx"; ///to set the path for file
		
		File file=new File(filepath); //to make the file
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);//to open the excel file
		
		Sheet sheet=workbook.getSheet("Sheet2"); //sheet1 is opened....
		
		int nrows=sheet.getPhysicalNumberOfRows();
		System.out.println("Total rows are... "+nrows);
		
		data=new Object[nrows][];
		
		for(int i=0;i<data.length;i++)
		{
			Row row=sheet.getRow(i);//to select perticular row
			
			int ncols=row.getPhysicalNumberOfCells();
			System.out.println("total no of cols are.. "+ncols);
			
			data[i]=new Object[ncols];
			for(int j=0;j<data[i].length;j++)
			{
				Cell cell=row.getCell(j);//particular column 
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
			}
		}
		return data;
	}
	WebDriver driver=null;
	@Test(dataProvider = "rahul")
	public void test(String keyword) throws InvalidFormatException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
	
		if(keyword.equals("open browser"))
		{
			driver=new ChromeDriver();
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter url"))
		{
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter username"))
		{
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter password"))
		{
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
		}
		else if(keyword.equals("click login"))
		{
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
		
			if(driver.getCurrentUrl().equals("https://www.saucedemo.com/"))
			{
				System.out.println("Your Test has been Failed...");
			}
			else
			{
				System.out.println("Your Test has been Passed...");
			}
		}
		else if(keyword.equals("close browser"))
		{
			Thread.sleep(2000);
			driver.close();
		}
	}
}
