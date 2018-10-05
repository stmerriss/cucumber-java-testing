package com.liferay.cucumber.selenium.test.functional.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Shane Merriss
 */
public class LoginPage extends BasePage {

	public static void clickSignIn() {
		WebElement signInButton = fetchButtonByNameContains("Sign In");

		signInButton.click();
	}

	public static void login(String username, String password) {
		typeUsername(username);
		typePassword(password);
		clickSignIn();
	}

	public static void typePassword(String password) {
		fetchWebElement(_passwordFieldBy).sendKeys(password);
	}

	public static void typeUsername(String username) {
		WebElement userNameField = fetchWebElement(_userNameFieldBy);

		userNameField.clear();
		userNameField.sendKeys(username);
	}

	public static final String LOGIN_PORTLET = "_com_liferay_login_web_portlet_LoginPortlet_";

	private static By _passwordFieldBy = new By.ById(LOGIN_PORTLET + "password");

	private static By _userNameFieldBy = new By.ById(LOGIN_PORTLET + "login");
}