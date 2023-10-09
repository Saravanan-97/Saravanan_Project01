package org.cc;

import io.cucumber.datatable.*;

import java.util.List;

import org.cc2.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amzonclass extends BaseClass {

	@Given("To launch the firefox browser and maximise the window")
	public void to_launch_the_firefox_browser_and_maximise_the_window() {

		launchBrowser();
		windowMaximize();
	}

	@When("To launch the amazon url")
	public void to_launch_the_amazon_url() {

		launchUrl(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}

	@When("To pass the valid email or mobile number in email field")
	public void to_pass_the_valid_email_or_mobile_number_in_email_field(io.cucumber.datatable.DataTable dataTable) {

		List<String> List = dataTable.asList();
		driver.findElement(By.id("ap_email")).sendKeys(List.get(1));

	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {

		WebElement clk = driver.findElement(By.id("continue"));
		clk.click();
	}

	@When("To pass the valid password in password field")
	public void to_pass_the_valid_password_in_password_field(io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> asLists = dataTable.asLists();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(asLists.get(1).get(1));

	}

	@When("To click the sign up button")
	public void to_click_the_sign_up_button() {

		WebElement sign = driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
		sign.click();
	}

	@Then("To close the entire browser")
	public void to_close_the_entire_browser() {

		closeEntireBrowser();

	}

}