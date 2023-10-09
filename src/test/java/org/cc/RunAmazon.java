package org.cc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
				glue = "org.cc",
				monochrome = true, 	
				dryRun = false,
				snippets = SnippetType.UNDERSCORE)
public class RunAmazon {

}
