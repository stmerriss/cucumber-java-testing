package com.liferay.cucumber.selenium.test.functional.util;

import com.liferay.cucumber.selenium.test.functional.constants.CucumberConstants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Shane Merriss
 */
public class WebDriverFactoryUtil {

	public static WebDriver getWebDriver(String browserType) {
		if (browserType.equals(CucumberConstants.CHROME)) {
			return new ChromeDriver();
		}
		else if (browserType.equals(CucumberConstants.FIREFOX)) {
			return new FirefoxDriver();
		}

		return null;
	}

}