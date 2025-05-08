package com.vodafone.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vodafone.base.AutomationWrapper;
import com.vodafone.pages.DashboardPage;
import com.vodafone.pages.LoginPage;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLoginTest() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();

		DashboardPage dashboard = new DashboardPage(driver);
		Assert.assertEquals(dashboard.getQuickLaunchText(), "Quick Launch");
	}

	@Test
	public void invalidLoginTest() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("john");
		login.enterPassword("admin123");
		login.clickOnLogin();

		String actualError = login.getInvalidErrorMessage();
		Assert.assertEquals(actualError, "Invalid credentials");
	}

}
