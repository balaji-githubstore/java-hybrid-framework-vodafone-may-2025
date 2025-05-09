package com.vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.vodafone.base.WebDriverKeywords;
/**
 * Handles all element of login page
 */
public class LoginPage extends WebDriverKeywords
{
	private By usernameLocator = By.name("username");
	private By passwordLocator = By.name("password");
	private By loginLocator = By.xpath("//button[normalize-space()='Login']");
	private By errorLocator = By.xpath("//p[contains(normalize-space(),'Invalid')]");

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void enterUsername(String username) {
		super.typeOnElement(usernameLocator, username);
	}

	public void enterPassword(String password) {
		typeOnElement(passwordLocator, password);
	}

	public void clickOnLogin() {
		clickOnElement(loginLocator);
	}

	public String getInvalidErrorMessage() {
		return getTextFromElement(errorLocator);
	}

	public String getUsernamePlaceholder() {
		return driver.findElement(usernameLocator).getDomAttribute("placeholder");
	}
}
