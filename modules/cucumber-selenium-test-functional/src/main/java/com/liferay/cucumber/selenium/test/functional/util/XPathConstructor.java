package com.liferay.cucumber.selenium.test.functional.util;

import org.openqa.selenium.By;

/**
 * @author Shane Merriss
 */
public class XPathConstructor {

	public static String buildXPathContains(
		String tagName, String attributeName, String attributeValue) {

		StringBuilder sb = new StringBuilder();

		sb.append("//");
		sb.append(tagName);
		sb.append("[contains(");
		sb.append(attributeName);
		sb.append(",'");
		sb.append(attributeValue);
		sb.append("')]");

		return sb.toString();
	}

	public static By getXPathContainsBy(
		String tagName, String attributeName, String attributeValue) {

		String xpath = buildXPathContains(
			tagName, attributeName, attributeValue);

		return new By.ByXPath(xpath);
	}

	public static String xpathGoUp(String base, int n) {
		String baseUpString = "/..";

		StringBuilder sb = new StringBuilder();

		sb.append(base);

		for (int i = 0; i < n; i++) {
			sb.append(baseUpString);
		}

		return sb.toString();
	}

}