package com.liferay.cucumber.selenium.test.functional.step;

import com.liferay.cucumber.selenium.test.functional.constants.CucumberConstants;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

/**
 * @author Shane Merriss
 */
public class NavigationSteps extends BaseSteps {

	@And("^I go to the home page$")
	public static void gotoJarvisHomePage() {
		getWebDriver().navigate().to(
			CucumberConstants.LOCALHOST_GROUP_JARVIS_URL);
	}

	@Given("^I go to the login page$")
	public static void gotoLoginPage() {
		getWebDriver().navigate().to(CucumberConstants.LOGIN_URL);
	}

	@And("^I go to '(.*?)'$")
	public static void gotoPage(String url) {
		getWebDriver().navigate().to(CucumberConstants.LOCALHOST_URL + url);
	}

}