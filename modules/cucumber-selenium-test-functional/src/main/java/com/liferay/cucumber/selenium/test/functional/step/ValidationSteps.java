package com.liferay.cucumber.selenium.test.functional.step;

import com.liferay.cucumber.selenium.test.functional.pages.GenericPage;

import cucumber.api.java.en.Then;

import java.util.List;

/**
 * @author Shane Merriss
 */
public class ValidationSteps extends BaseSteps {

	@Then("^I get validation messages")
	public void checkValidationMessages(List<String> validationMessages) {
		validationMessages.stream()
			.forEach(message -> GenericPage.hasSuccessMessage(message));
	}

}