package com.liferay.cucumber.selenium.test.functional.pages;

import com.liferay.cucumber.selenium.test.functional.util.XPathConstructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Shane Merriss
 */
public class GenericPage extends BasePage {

	public static String getPageHeaderTitle() {
		return fetchWebElement(headerTitleBy).getText();
	}

	public static boolean hasSuccessMessage(String message) {
		WebElement alertWebElement = fetchWebElement(_alertBy);

		if (alertWebElement == null) {
			return false;
		}

		By messageBy = XPathConstructor.getXPathContainsBy("div", ".", message);

		WebElement messageSuccess = alertWebElement.findElement(messageBy);

		if (messageSuccess == null) {
			return false;
		}

		return true;
	}

	protected static By headerTitleBy = new By.ByClassName("header-page-title");

	private static By _alertBy = new By.ByClassName("liferayalert");

}