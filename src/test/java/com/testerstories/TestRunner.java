package com.testerstories;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		  plugin = {"pretty", "html:target/cucumber-html-report"},
		  features="src/main/java/features"
		)

public class TestRunner {}