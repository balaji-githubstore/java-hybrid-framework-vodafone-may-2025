package com.vodafone.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Will be deleted
 */

public class ZDemo1Test {

	@DataProvider
	public Object[][] validData() {
		Object[][] data = new Object[3][2];
		// i--> number of testcases
		// j-->number of arguments

		data[0][0] = "john";
		data[0][1] = 787878;

		data[1][0] = "saul";
		data[1][1] = "saul123";

		data[2][0] = "kim";
		data[2][1] = "kim123";

		return data;
	}

	@Test(dataProvider = "validData")
	public void loginTest(String username, String password) {
		System.out.println("login test" + username + password);
	}

}
