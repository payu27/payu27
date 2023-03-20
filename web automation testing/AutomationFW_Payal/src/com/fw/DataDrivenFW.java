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
import org.testng.annotations.Test;

public class DataDrivenFW 
{
	@Test
	public String[][] readExcel() throws InvalidFormatException, IOException
	{
		String[][] data=null;
		
		String filepath="D:\\rahul\\payalpoi.xlsx"; ///to set the path for file
		
		File file=new File(filepath); //to make the file
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);//to open the excel file
		
		Sheet sheet=workbook.getSheet("Sheet1"); //sheet1 is opened....
		
		int nrows=sheet.getPhysicalNumberOfRows();
		System.out.println("Total rows are... "+nrows);
		
		data=new String[nrows][];
		
		for(int i=0;i<data.length;i++)
		{
			Row row=sheet.getRow(i);//to select perticular row
			
			int ncols=row.getPhysicalNumberOfCells();
			System.out.println("total no of cols are.. "+ncols);
			
			data[i]=new String[ncols];
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
	@Test
	public void test() throws InvalidFormatException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		
		String[][] data=readExcel();
		for(int i=0;i<data.length;i++)
		{
			driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys(data[i][0]);
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys(data[i][1]);
			Thread.sleep(2000);
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
			Thread.sleep(2000);
			driver.close();
		}
	}
}
