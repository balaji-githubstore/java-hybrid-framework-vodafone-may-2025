package com.vodafone.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vodafone.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {
	
	@Test
	public void validLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		//password as admin123
		//click on login
		//Assert the text - Quick Launch
	}

}
