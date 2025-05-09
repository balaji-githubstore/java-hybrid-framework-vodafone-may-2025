package com.vodafone.test;

import org.testng.annotations.Test;

import com.vodafone.base.AutomationWrapper;
import com.vodafone.pages.LoginPage;
import com.vodafone.utils.DataUtils;

public class EmployeeTest extends AutomationWrapper {

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void addValidEmployeeTest(String username,String password,String firstname,String middlename,String lastname,String expectedName)
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();
		
		//Goto MainPage
		//click on PIM Menu
		
		//Goto PIMPage
		//click on Add Employee
		
		//Goto AddEmployeePage
		//Enter firstname 
		//Enter middlename
		//Enter lastname
		//click save
		
		//Goto EmployeeListPage
		//GettheActualProfileName
		
		
		//Assert the profile name 
		
	}
}
