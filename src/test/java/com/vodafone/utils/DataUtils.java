package com.vodafone.utils;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

/*
 * Class contains all the dataproviders details
 */
public class DataUtils {
	
//	public static Object[][] invalidData={ { "john", "john123" }, { "saul", "saul223" }, { "kim", "kim123" } };
	
	@DataProvider
	public Object[][] invalidLoginData()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="john";
		data[0][1]="john123";
		data[0][2]="Invalid credentials";
		
		data[1][0]="saul";
		data[1][1]="saul";
		data[1][2]="Invalid credentials";
		
		return data;
	}
	
	@DataProvider
	public Object[][] commonDataProvider(Method mtd) throws IOException
	{
		//Sheetname is the @Test method name
		String testMethodName= mtd.getName();
		
		Object[][] data=ExcelUtils.getSheetIntoTwoDimensionalArray("test-data/orange-test-data.xlsx", testMethodName);
		return data;
	}
	
}


