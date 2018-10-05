package com.liferay.cucumber.selenium.test.functional.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

/**
 * @author Shane Merriss
 */
@CucumberOptions(
	features = "src/main/resources/features/Login.feature",
	glue = {"com.liferay.cucumber.selenium.test.functional.step"}
)
@RunWith(Cucumber.class)
public class LoginRunner {
}