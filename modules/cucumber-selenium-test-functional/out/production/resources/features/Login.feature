Feature: Test the login functionality of Jarvis site

  Background:
	Given I go to the login page

  Scenario: Correct username and password
	Given I log in as 'test@liferay.com' with password 'test'