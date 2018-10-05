package com.liferay.cucumber.selenium.test.functional.step;

import com.liferay.cucumber.selenium.test.functional.pages.GenericPage;
import com.liferay.cucumber.selenium.test.functional.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.NoSuchElementException;

import org.junit.Assert;

/**
 * @author Shane Merriss
 */
public class LoginSteps extends BaseSteps {

	@Given("^I log in as '(.*?)' with password '(.*?)'$")
	public static void login(String userName, String password) {
		System.out.println(
			"Logging in with {" + userName + ":" + password + "}");

		LoginPage.login(userName, password);
	}

	@Given("^I am log in as '(.*?)' with password '(.*?)'$")
	public static void navigateAndLogin(String userName, String password) {
		NavigationSteps.gotoLoginPage();

		login(userName, password);
	}

	@Then("^I should see the Jarvis home page$")
	public static void user_gets_confirmation() {
		boolean loggedIn = false;

		try {
			loggedIn =
				GenericPage.getPageHeaderTitle().toLowerCase().contains("jarvis");
		}
		catch (NoSuchElementException nsee) {
		}

		Assert.assertTrue(loggedIn);
	}

}