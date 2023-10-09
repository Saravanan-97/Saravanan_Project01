package org.cc2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.cc2",
monochrome = true,
dryRun = false,
snippets = SnippetType.UNDERSCORE,
plugin = "json:target/cucumber-reports/Cucumber.json")
public class Runmyntra {

}
























