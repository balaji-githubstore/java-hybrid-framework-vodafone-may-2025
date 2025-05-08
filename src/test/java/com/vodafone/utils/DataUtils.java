package com.vodafone.utils;

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
	
	
}
