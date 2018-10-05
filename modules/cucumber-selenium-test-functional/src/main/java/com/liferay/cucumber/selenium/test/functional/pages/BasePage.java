package com.liferay.cucumber.selenium.test.functional.pages;

import com.liferay.cucumber.selenium.test.functional.BaseWebDriver;
import com.liferay.cucumber.selenium.test.functional.util.XPathConstructor;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Shane Merriss
 */
public class BasePage extends BaseWebDriver {

	protected static WebElement fetchButtonByNameContains(String name) {
		return fetchByXPathContains("button", ".", name);
	}

	protected static WebElement fetchByDataQAIdContains(
		String tagName, String qaId) {

		return fetchByXPathContains(tagName, "@data-qa-id", qaId);
	}

	protected static WebElement fetchByXPathContains(
		String tagName, String attributeName, String attributeValue) {

		By xpathBy = XPathConstructor.getXPathContainsBy(
			tagName, attributeName, attributeValue);

		try {
			return fetchWebElement(xpathBy);
		}
		catch (NoSuchElementException nsee) {
			return null;
		}
	}

	protected static WebElement fetchWebElement(By by) {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(getWebDriver(), 5);

			webDriverWait.until(ExpectedConditions.elementToBeClickable(by));

			return getWebDriver().findElement(by);
		}
		catch (NoSuchElementException nsee) {
			return null;
		}
		catch (TimeoutException te) {
			return null;
		}
	}

}