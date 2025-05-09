package com.vodafone.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vodafone.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {
	
	@Test(groups = {"smoke","ui"})
	public void titleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Test(groups = {"ui"})
	public void headerTitle() {
		// Assert the header - Login
		String actualHeader = driver.findElement(By.xpath("//h5")).getText();
		Assert.assertEquals(actualHeader, "Login");
	}
}
