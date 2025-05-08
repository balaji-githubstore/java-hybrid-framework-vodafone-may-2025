package com.vodafone.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vodafone.base.AutomationWrapper;
import com.vodafone.pages.DashboardPage;
import com.vodafone.pages.LoginPage;
import com.vodafone.utils.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void validLoginTest(String username,String password,String expectedValue) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		DashboardPage dashboard = new DashboardPage(driver);
		Assert.assertEquals(dashboard.getQuickLaunchText(), expectedValue);
	}

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void invalidLoginTest(String username, String password, String expectedError) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		String actualError = login.getInvalidErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}
}
