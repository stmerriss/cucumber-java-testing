package com.liferay.cucumber.selenium.test.functional;

import com.liferay.cucumber.selenium.test.functional.constants.CucumberConstants;
import com.liferay.cucumber.selenium.test.functional.util.WebDriverFactoryUtil;

import org.openqa.selenium.WebDriver;

/**
 * @author Shane Merriss
 */
public class BaseWebDriver {

	protected static WebDriver getWebDriver() {
		return _webDriver;
	}

	protected void setWebDriver(WebDriver webDriver) {
		_webDriver = webDriver;
	}

	protected void startWebDriver() {
		_webDriver = WebDriverFactoryUtil.getWebDriver(
			CucumberConstants.CHROME);
	}

	protected void stopWebDriver() {
		_webDriver.quit();
	}

	private static WebDriver _webDriver;

}