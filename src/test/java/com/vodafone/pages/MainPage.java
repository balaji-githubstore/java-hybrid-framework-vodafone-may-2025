package com.vodafone.pages;

import org.openqa.selenium.WebDriver;

import com.vodafone.base.WebDriverKeywords;
/**
 * All menu will be handled here
 */
public class MainPage extends WebDriverKeywords {
	private WebDriver driver;
	
	public MainPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}
