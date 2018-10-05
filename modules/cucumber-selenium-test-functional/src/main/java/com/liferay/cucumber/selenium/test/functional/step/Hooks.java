package com.liferay.cucumber.selenium.test.functional.step;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author Shane Merriss
 */
public class Hooks extends BaseSteps {

	@After
	public void after() {
		stopWebDriver();
	}

	@Before
	public void before() {
		startWebDriver();
	}

}